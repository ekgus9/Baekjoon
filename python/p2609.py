import sys

n1,n2 = map(int,sys.stdin.readline().split())
    
for i in range(max(n1,n2),0,-1):
    if n1 % i == 0 and n2 % i == 0: 
        print(i)
        break
    
mi = min(n1,n2)
ma = max(n1,n2)
i,j = 0,0
while True:
    i += 1
    while ma * i >= mi * j:
        j += 1
        if ma * i == mi * j : 
            print(ma*i)
            break
            
    if ma * i == mi * j : break