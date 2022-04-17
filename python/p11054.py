import sys

n = int(sys.stdin.readline())
s = [int(i) for i in sys.stdin.readline().split()]

dp = [[1,1]]

for i in range(1,n):
    dp.append([1,1])
    for j in range(i):
        if s[i] > s[j]: dp[i][0] = max(dp[i][0],dp[j][0]+1)
        if s[i] < s[j]: dp[i][1] = max(dp[i][1],max(dp[j])+1)
    
m = 0    
for i in dp:
    m = max(m,max(i))

print(m)