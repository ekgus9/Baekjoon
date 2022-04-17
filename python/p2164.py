import sys

n = int(sys.stdin.readline())
s = ['*']*1000000
start = 0
tail = n

for i in range(n):
    s[i] = i+1

i = 0
while tail - start > 1:
    if i % 2 == 0: 
        start += 1
    else:
        s[tail] = s[start]
        tail += 1
        start += 1
    i+=1

if len(s) == 0: print(1)
else: print(s[start])