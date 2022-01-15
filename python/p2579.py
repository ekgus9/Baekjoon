from sys import stdin

N = int(stdin.readline())
dp = [0]*(N+3)
arr = [0]*(N+3)
    
for i in range(N):
    arr[i] = int(stdin.readline())
    dp[0] = arr[0]
    dp[1] = arr[0] + arr[1]
    dp[2] = max(arr[0]+arr[2],arr[1]+arr[2])

    for j in range(3,N):
        dp[j] = max(dp[j-3]+arr[j-1]+arr[j],dp[j-2]+arr[j])

print(dp[N-1])
