import sys
from collections import deque

n = int(sys.stdin.readline())
d = deque([])

for i in range(n):
    com = sys.stdin.readline()
    
    if 'push_back' in com : 
        d.append(int(com.split()[-1]))
    elif 'push_front' in com:
        d.appendleft(int(com.split()[-1]))
    elif 'pop_front' in com:
        if len(d) == 0 : print(-1)
        else: print(d.popleft())
    elif 'pop_back' in com:
        if len(d) == 0 : print(-1)
        else: print(d.pop())
    elif 'size' in com:
        print(len(d))
    elif 'empty' in com:
        if len(d) == 0: print(1)
        else: print(0)
    elif 'front' in com:
        if len(d) == 0 : print(-1)
        else: print(d[0])
    elif 'back' in com:
        if len(d) == 0 : print(-1)
        else: print(d[-1])
        