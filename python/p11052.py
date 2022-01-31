from sys import stdin

n = int(stdin.readline())
lst = list(map(int,stdin.readline().split()))
lst.insert(0,0)

dp = [1]*(n+1)

for i in range(2,n+1):
    for j in range(1,i+1):
        if lst[i] > lst[j] : dp[i] = max(dp[i],dp[j]+1)
    
print(max(dp))