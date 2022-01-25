from sys import stdin

n = int(stdin.readline())
case = []

for i in range(n):
    case.append(int(stdin.readline()))
    
dp = [0, 1, 2, 4]

for i in range(4,max(case)+1):
    dp.append(dp[i-1] + dp[i-2] + dp[i-3])

for i in range(n):
    print(dp[case[i]])