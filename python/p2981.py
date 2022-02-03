import sys
import math

N = int(sys.stdin.readline())
a = [0]
for _ in range(N): a.append(int(sys.stdin.readline()))
    
# 두 수의 차를 m으로 나눴을 때 나누어 떨어진다면 나머지 동일
# 약수는 제곱근까지 구하고, 해당 수를 구해진 약수로 나누면 나머지 약수가 구해짐

lst = []

for i in range(1,N):
    v = a[i+1] - a[i]
    if v < 0 : v = -v
    lst2 = []
    
    for j in range(1, int(math.floor(math.sqrt(v)))+1):
        if v % j == 0 : 
            lst2.append(j)
            lst2.append(v//j)
    
    if len(lst) == 0:
        lst = lst2
    else:
        lst3 = []
        for j in range(len(lst)):
            if lst[j] in lst2: lst3.append(lst[j])
        lst = lst3

lst.pop(0)
lst.sort()
[print(i,end=' ') for i in lst]