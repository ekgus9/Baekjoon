from sys import stdin
n = [int(i) for i in stdin.readline().split()]
lst = [int(i) for i in stdin.readline().split()]

dp = [0]

for i in range(1,n[0]+1):
    dp.append(dp[i-1] + lst[i-1])
    
for i in range(1,n[1]+1):
    ij = [int(j) for j in stdin.readline().split()]
    print(dp[ij[1]]-dp[ij[0]-1])