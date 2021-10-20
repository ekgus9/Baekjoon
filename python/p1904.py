import sys
n =int(sys.stdin.readline())

r=[None]*(n+2)
r[1] = 1
r[2] = 2

for i in range(3,n+1):
    r[i] = (r[i-1]+r[i-2])%15746

print(r[n])
