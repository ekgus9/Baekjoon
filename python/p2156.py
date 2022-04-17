n = int(input())

wine = []
dp = []

for _ in range(n):
    wine.append(int(input()))
    
dp.append([wine[0],0])
if n > 1:
    dp.append([wine[1],wine[0]+wine[1]])
    
    for i in range(2,n):
        if i == 2: dp.append([max(dp[i-2])+wine[i],dp[i-1][0]+wine[i]])
        else: 
            dp.append([max(max(dp[i-2]),max(dp[i-3]))+wine[i],dp[i-1][0]+wine[i]])
     
print(max(max(dp[n-1]),max(dp[n-2])))