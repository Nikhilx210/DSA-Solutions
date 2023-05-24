from numpy import nan
from pandas import DataFrame as df, MultiIndex
states = []
parsing_table = df()
class State:
    _n = 0
    _count = 0 + _n
    graph = []

    def __init__(self):
        self.rules = []
        self._i = State._count
        self.hasreduce = 0
        State._count = State._count + 1

    def add_rule(self, rule):
        '''add new rule to the state'''
        if rule not in self.rules:
            self.rules.append(rule)
            if rule._closure == -1:
                self.hasreduce = 1

    def goto(self, distination_index, symbol):
        g = [self._i, distination_index, symbol]
        if g not in State.graph:
            State.graph.append(g)

    def closure(self):
        for rule in self.rules:
            if rule.visited:
                continue
            for r in rule.visit():
                if r not in self.rules:
                    self.add_rule(r)

    def __eq__(self, s):
        if not isinstance(s, State):
            return NotImplemented
        eq = True
        if self.rules.__len__() > s.rules.__len__():
            return False
        for r in self.rules:
            eq = eq and (r in s.rules)
        return eq

    def __str__(self):
        s = []
        max_len = 1
        for r in self.rules:
            line = '    [' + str(r)
            s.append(line)
            if len(line) > max_len: max_len = len(line)
        for i in range(len(s)):
            pad = max_len - len(s[i])
            s[i] = s[i] + ' ' * pad + ']'
        s.insert(0, ''.join(['I', str(self._i), ':', ' ' * (max_len - 2)]))
        return '\n'.join(s)


class Rule:
    _n = 0
    augmented = []

    def __init__(self, lhs, rhs=[], dot_index=0):
        self.lhs = lhs
        if rhs == ['!εpslon']:
            self.rhs = []
        else:
            self.rhs = rhs
        self._closure = dot_index

        if self.dotatend():
            self._closure = -1

        self.visited = 0

    def __str__(self):
        rhs = list(self.rhs)
        dot = self._closure
        if dot == -1:
            dot = len(rhs)
        rhs.insert(dot, '•')
        return self.lhs + ' → ' + ' '.join(rhs)

    def __eq__(self, rule):
        if not isinstance(rule, Rule):
            return NotImplemented
        return self.lhs == rule.lhs and self.rhs == rule.rhs and self._closure == rule._closure

    def handle(self):
        return self.rhs[self._closure]

    def visit(self):
        self.visited = 1
        if self._closure != -1:
            handle = self.rhs[self._closure]
            if handle.startswith('`'):
                return [r.copy() for r in Rule.augmented if r.lhs == handle]
        return []

    def dotatend(self):
        if self._closure == len(self.rhs):
            return True
        return False

    def movedot(self):
        if self._closure == -1:
            return None
        return Rule(self.lhs, self.rhs, self._closure + 1)

    def copy(self):
        return Rule(self.lhs, self.rhs)

def grammar_fromstr(g):
    grm = g.split('\n')
    rules = []
    for r in grm:
        if r.strip() == '': continue  # skip empty lines
        lhs, rhs_ls = r.split('=>')
        for rhs in rhs_ls.split('|'):
            rules.append((lhs.strip(), rhs.strip().split()))
    return rules


def augment(grammar_str):
    grammar = grammar_fromstr(grammar_str)
    rhs = [grammar[0][0]]
    aug = Rule(grammar[0][0] + "'", tuple(rhs))
    s = State()
    s.add_rule(aug)
    Rule.augmented.append(aug)
    for r in grammar:
        Rule.augmented.append(Rule(r[0], r[1]))
    return s, extract_symbols(grammar)


def extract_symbols(rules):
    terminals = []
    non_terminals = []
    for r in rules:
        if r[0] not in non_terminals:
            non_terminals.append(r[0])
        for s in r[1]:
            if not s.startswith('`'):
                if s not in terminals:
                    if s != '!εpslon':
                        terminals.append(s)
            else:
                if s not in non_terminals:
                    non_terminals.append(s)
    terminals.append('$')
    return (non_terminals, terminals)


def goto_operation():
    for s in states:
        transitions = []
        for r in s.rules:
            rule = r.movedot()
            dotatend = rule == None
            if dotatend:
                continue
            transitions.append((r.handle(), rule))

        gotoself(transitions, s)

        for t in transitions:
            items_same_X = [r for r in transitions if r[0] == t[0]]
            make_transition(s, items_same_X)
    return State.graph


def gotoself(transitions, s):
    for t in transitions:
        if t[1] in s.rules:
            s.goto(s._i, t[0])
            transitions.remove(t)


def make_transition(source, items_same_X):
    new_state = newstate(items_same_X)
    exists = False
    for s in states:
        if new_state == s:
            source.goto(s._i, symbol=items_same_X[0][0])
            exists = True
            State._count = State._count - 1
            break
    if not exists:
        new_state.closure()
        states.append(new_state)
        source.goto(new_state._i, symbol=items_same_X[0][0])


def newstate(items_same_X):
    new_state = State()
    for r in items_same_X:
        new_state.add_rule(r[1])
    return new_state


def parsing_table_skelton(non_terminals, terminals):
    levels = (['action'] * len(terminals) + ['goto'] * len(non_terminals))
    columns = terminals + non_terminals
    index = [s._i for s in states]
    return df(index=index,
              columns=MultiIndex.from_tuples(list(zip(levels, columns)), names=['table', 'symbol'])).fillna('_')

def run(grammar):
    global parsing_table
    start_state, symbols = augment(grammar)
    start_state.closure()
    states.append(start_state)
    items = goto_operation()
    parsing_table = parsing_table_skelton(symbols[0], symbols[1])
    return items


def test(grammar, test_string):
    states_graph = run(grammar)
    for s in states:
        print(s, end='\n')




if __name__ == '__main__':
    print(augment.__doc__)
    g4 = """`A => `A + `B
    `A => `B 
    `B => `B * `F 
    `B => `N 
    `N => ( `A ) 
    `N => id"""

    print(g4, end='\n------grammar------\n\n')
    test(g4, 'id + id * id')