# 냅색 알고리즘

from sys import stdin

n,k = map(int,stdin.readline().split())
lst = [[0,0]]*(n+1)
kn = [[0 for _ in range(k + 1)] for _ in range(n + 1)]

for i in range(1,n+1):
    lst[i] = list(map(int,stdin.readline().split()))

for i in range(1,n+1):
    for j in range(1, k+1):
        w = lst[i][0]
        v = lst[i][1]
        if w > j:
            kn[i][j] = kn[i-1][j]
        else:
            kn[i][j] = max(v+kn[i-1][j-w],kn[i-1][j])

print(kn[n][k])