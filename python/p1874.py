import sys

N = int(sys.stdin.readline())
result = []
a = []
stack = []
for _ in range(N):
    a.append(int(sys.stdin.readline()))

for i in range(1, N+1):
    stack.append(i)
    result.append('+')
    while len(stack) != 0:
        if stack[-1] == a[0]:
            a.pop(0)
            stack.pop(-1)
            result.append('-')
        else: break
        
if len(a) != 0: print('NO')
else: [print(i) for i in result]