n = int(input())

dp = [0,[0,1,1,1,1,1,1,1,1,1]]

if n>1:
    for i in range(2,n+1):
        dp.append([])
        for _ in range(10):
            dp[i].append(0)
        for j in range(10):
            if j == 0:
                dp[i][1] += dp[i-1][j]
            elif j == 9:
                dp[i][8] += dp[i-1][j]
            else:  
                dp[i][j-1] += dp[i-1][j]
                dp[i][j+1] += dp[i-1][j]
            
print(sum(dp[n])%1000000000)