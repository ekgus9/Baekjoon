N = int(input())

tree = []

for i in range(N):
    tree.append([int(j) for j in input().split()])
    
dp = []
dp.append([])
dp[0].append(tree[0][0])

for i in range(1,N):
    dp.append([])
    for j in range(i):
        if j>0:
            a = dp[i].pop(-1)
            dp[i].append(max(a,dp[i-1][j] + tree[i][j]))
        else: dp[i].append(dp[i-1][j] + tree[i][j])
        
        dp[i].append(dp[i-1][j] + tree[i][j+1])

print(max(dp[N-1]))