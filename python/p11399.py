import sys

N = int(sys.stdin.readline())

lst = [int(i) for i in sys.stdin.readline().split()]
lst.sort()
result = 0

for i in range(len(lst)):
    result += lst[i] * (len(lst)-i)
    
print(result)