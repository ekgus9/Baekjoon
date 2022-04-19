import sys

r1, c1 = map(int,sys.stdin.readline().split())
m1 = []
for i in range(r1):
    m1.append([int(j) for j in sys.stdin.readline().split()])
  
r2, c2 = map(int,sys.stdin.readline().split())  
m2 = []
for i in range(r2):
    m2.append([int(j) for j in sys.stdin.readline().split()])

for i in range(r1):
    for j in range(c2):
        nn = 0
        for h in range(c1):
            nn += m1[i][h] * m2[h][j]
            
        print(nn,end=' ')
    print()