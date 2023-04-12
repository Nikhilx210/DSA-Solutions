from pywsd.lesk import simple_lesk
from nltk.wsd import lesk
from nltk.tokenize import word_tokenize
from nltk.corpus import wordnet as wn
import time
import timeit
import nltk

nltk.download('averaged_perceptron_tagger')



for ss in wn.synsets('goal'):
   print(ss, ss.definition())
print('======================================================')
#sent1 = 'The striker scored by hitting the goal post and then falling.'
sent1=input("enter first sentence : ")
#sent2 = 'One needs to have a defined goal first, and then must put in effort to reach it.'
sent2=input("enter second sentence : ")

print('Sentence1:   ',sent1)
print('Sentence2:   ',sent2)
print('======================================================')
sent1_tok = word_tokenize(sent1)
sent2_tok = word_tokenize(sent2)
print('Lesk Algo')
start = time.process_time()+1
print(start)
lt1 = lesk(sent1_tok, 'goal')
st1 = time.process_time() - start
print('Sent1: ',lt1,'   Time:  ')

start = time.process_time()
print(start)
lt2 = lesk(sent2_tok, 'goal')
st2 = time.process_time() - start
print('Sent2: ',lt2 ,'   Time:  ')
#print(time.time())
print('----------------------------------------------------------')
print('Simple Lesk Algo')
start = time.time()
answer1 = simple_lesk(sent1,'goal')
print("Sent1:   ", answer1 ,)

start = time.time()
answer2 = simple_lesk(sent2,'goal')
print("Sent2:   ", answer2 ,)


print('======================================================')
