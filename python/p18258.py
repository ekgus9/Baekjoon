import sys
# 원형 큐 구현
N = int(sys.stdin.readline())
m = 2000000
que = [0]*m 
front = 0
back = 0

def size():
    if front <= back: return back - front
    else : return back + m - front

for _ in range(N):
    a = sys.stdin.readline()
    if 'push' in a:
        p,n = map(str,a.split())
        que[back] = int(n)
        back = (back+1)%m
    elif 'pop' in a:
        if size() == 0: print(-1)
        else: 
            print(que[front])
            front = (front+1)%m
    elif 'size' in a : print(size())
    elif 'empty' in a : 
        if size() == 0: print(1)
        else: print(0)
    elif 'front' in a: 
        if size() == 0: print(-1)
        else: print(que[front])
    elif 'back' in a: 
        if size() == 0: print(-1)
        else: print(que[(back-1)%m])