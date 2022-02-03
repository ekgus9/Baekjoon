from math import factorial
import sys

N = int(sys.stdin.readline())
m = str(factorial(N))
result = 0

for i in range(len(m)-1,-1,-1):
    if m[i] == '0' : result += 1
    else : break
print(result)