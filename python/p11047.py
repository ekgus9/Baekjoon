from sys import stdin

n,k = map(int,stdin.readline().split())
coin = [0]
result = 0

for i in range(1,n+1):
    coin.append(int(stdin.readline()))
    
for i in range(n,0,-1):
    if k == 0 : break
    if coin[i]<=k:
        result += k // coin[i]
        k = k % coin[i]
        
print(result)