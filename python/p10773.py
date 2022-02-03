import sys

N = int(sys.stdin.readline())
a = []
for _ in range(N):
    w = int(sys.stdin.readline())
    if w == 0: a.pop(-1)
    else: a.append(w)   

if len(a) == 0 : print(0)
else: print(sum(a))