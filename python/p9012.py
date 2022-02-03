import sys

N = int(sys.stdin.readline())

for _ in range(N):
    g = sys.stdin.readline()
    s = []
    tf = True
    for i in g:
        if i == '(':
            s.append('(')
        elif i == ')':
            if len(s) == 0 : 
                print('NO')
                tf = False
                break
            s.pop(-1)
    if tf :
        if len(s) != 0 : print('NO')
        else: print('YES')    