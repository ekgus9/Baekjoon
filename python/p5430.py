import sys
from collections import deque

n = int(sys.stdin.readline())

def D(d):
    if sequence == 1:
        d.popleft()
    elif sequence == 0:
        d.pop()

for i in range(n):
    com = sys.stdin.readline()
    nn = int(sys.stdin.readline())

    st = sys.stdin.readline()
    if '[]' in st:
        d = deque([])
    else:
        d = deque([int(j) for j in st[1:-2].split(',')])
    
    t = True
    sequence = 1
    for j in com:
        if j == 'R':
            if sequence == 0: sequence = 1
            elif sequence == 1: sequence = 0
        elif j == 'D':
            if len(d) == 0: 
                print('error')
                t = False
                break 
            else: D(d)
            
    if t : 
        if len(d) == 0 : 
            print([])
        else:
            result = '['
            if sequence == 1:
                for i in d:
                    result = result + str(i) + ','
            elif sequence == 0:
                for i in range(len(d)-1,-1,-1):
                    result = result + str(d[i]) + ','
            print(result[0:-1]+']')