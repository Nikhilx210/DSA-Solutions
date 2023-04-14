import sys


class lab(object):
    @staticmethod
    def Data(arr):
        s = ""
        i = 0
        while (i < 3):
            j = 0
            while (j < 3):
                if (arr[i][j] == 0):
                    s += " "
                else:
                    s += str(arr[i][j]) + ""
                j += 1
            i += 1
        return s

    @staticmethod
    def children(s):
        x = -1
        y = -1
        k = 0
        matrix = [[0] * (3) for _ in range(3)]
        i = 0
        while (i < 3):
            j = 0
            while (j < 3):
                if (s[k] == ' '):
                    x = i
                    y = j
                    matrix[i][j] = 0
                else:
                    matrix[i][j] = int(str(s[k]) + "")
                k += 1
                j += 1
            i += 1
        v = -1
        a = ""
        b = ""
        c = ""
        d = ""
        if (x - 1 >= 0):
            v = matrix[x - 1][y]
            matrix[x - 1][y] = matrix[x][y]
            matrix[x][y] = v
            a = lab.Data(matrix)
            v = matrix[x - 1][y]
            matrix[x - 1][y] = matrix[x][y]
            matrix[x][y] = v
        if (y - 1 >= 0):
            v = matrix[x][y - 1]
            matrix[x][y - 1] = matrix[x][y]
            matrix[x][y] = v
            b = lab.Data(matrix)
            v = matrix[x][y - 1]
            matrix[x][y - 1] = matrix[x][y]
            matrix[x][y] = v
        if (x + 1 < 3):
            v = matrix[x + 1][y]
            matrix[x + 1][y] = matrix[x][y]
            matrix[x][y] = v
            c = lab.Data(matrix)
            v = matrix[x + 1][y]
            matrix[x + 1][y] = matrix[x][y]
            matrix[x][y] = v
        if (y + 1 < 3):
            v = matrix[x][y + 1]
            matrix[x][y + 1] = matrix[x][y]
            matrix[x][y] = v
            d = lab.Data(matrix)
            v = matrix[x][y + 1]
            matrix[x][y + 1] = matrix[x][y]
            matrix[x][y] = v
        m = []
        if (len(a) != 0):
            m.append(a)
        if (len(b) != 0):
            m.append(b)
        if (len(c) != 0):
            m.append(c)
        if (len(d) != 0):
            m.append(d)
        return m

    @staticmethod
    def agent(i, h, a, target):
        if (i==target):
            a.append(i)
            return True
        if (i in h.keys()):
            return False
        else:
            h[i]=1
        a.append(i)
        d = lab.children(i)
        for s in d:
            if (lab.agent(s, h, a, target)):
                return True
        a.remove(i)
        return False

    @staticmethod
    def main(args):
        arr = [[1,3,0], [5,2,6], [4,7,8]]
        target = [[1, 2, 3], [4, 5, 6], [7, 8, 0]]
        s = ""
        t = ""
        i = 0
        while (i < 3):
            j = 0
            while (j < 3):
                if (arr[i][j] == 0):
                    s += " "
                else:
                    s += str(arr[i][j]) + ""
                if (target[i][j] == 0):
                    t += " "
                else:
                    t += str(target[i][j]) + ""
                j += 1
            i += 1
        print(s)
        print(t)
        h = {}
        a = []
        lab.agent(s, h, a, t)
        print(a)


if _name_ == "_main_":
    lab.main(sys.argv)