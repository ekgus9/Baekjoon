from sys import stdin
n = int(stdin.readline())

dp = [0]*1000001
lst = [0, 1]

for i in range(2,n+1):
    dp[i] = dp[i-1]
    lst.append(i-1)
        
    if i % 3 == 0: 
        dp[i] = min(dp[i],dp[i//3])
        if min(dp[i],dp[i//3]) == dp[i//3]:
            lst[i] = i//3

    if i % 2 == 0: 
        dp[i] = min(dp[i],dp[i//2])
        if min(dp[i],dp[i//2]) == dp[i//2]:
            lst[i] = i//2

    dp[i] += 1
    
print(dp[n])
print(n, end = ' ')
while n != 1: 
    print(lst[n], end = ' ')
    n = lst[n]
    