import sys

def power(m,n):
    if n==1: return m
    
    p = power(m,n//2)
    t = z(p,p)
    if n%2==0: return t
    else: return z(t,m)
    
def z(m, c): 
    result = [[0]*N for _ in range(N)]
    for i in range(N):
        for j in range(N):
            nn=0
            for h in range(N):
                nn += m[i][h] * c[h][j]
            result[i][j] = nn%1000
    return result

N, B = map(int, sys.stdin.readline().split())
m = []
for i in range(N):
    m.append([int(j) for j in sys.stdin.readline().split()])

a = power(m,B)

for i in a:
    for j in i:
        print(j%1000, end=' ')
    print()