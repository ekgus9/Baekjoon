from sys import stdin

n = int(stdin.readline())

dp = [[0,0,0]]*1001
for i in range(1,n+1):
    dp[i] = [int(j) for j in stdin.readline().split()]

for i in range(2,n+1):
    dp[i][0] = dp[i][0] + min(dp[i-1][1],dp[i-1][2])
    dp[i][1] = dp[i][1] + min(dp[i-1][0],dp[i-1][2])
    dp[i][2] = dp[i][2] + min(dp[i-1][0],dp[i-1][1])

print(min(dp[n]))