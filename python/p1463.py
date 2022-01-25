n = int(input())

dp = [0] * 1000001

for i in range(2,n+1): 

    dp[i] = dp[i-1]
    if i % 3 == 0 : dp[i] = min(dp[i],dp[i//3])
    if i % 2 == 0 : dp[i] = min(dp[i],dp[i//2])

    dp[i] += 1
    
print(dp[n])