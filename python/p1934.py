import sys

N = int(sys.stdin.readline())

for _ in range(N):
    a,b = map(int,sys.stdin.readline().split())
    a1,b1 = a,b
    
    if a<b:
        tmp = b
        b = a
        a = tmp
        
    while b != 0:
        n = a%b
        a = b
        b = n
        
    print(int(a1 * b1 / a))