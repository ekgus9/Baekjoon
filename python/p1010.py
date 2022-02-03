from math import factorial
import sys

N = int(sys.stdin.readline())

for i in range(N):
    n,m = map(int,sys.stdin.readline().split())
    # n < m
    if n > m:
        tmp = n
        n = m
        m = tmp
        
    print(factorial(m)//(factorial(n)*factorial(m-n)))