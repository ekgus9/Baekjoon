from math import factorial
import sys

n,k = map(int,sys.stdin.readline().split())

print(factorial(n)/(factorial(n-k)*factorial(k)))