import sys

def find(n,l):
    mid = len(l)//2
    start = 0
    end = len(l)-1
    
    while end - start >= 0:
        if l[mid] == n: return True
        elif l[mid] > n: 
            end = mid - 1
            mid = end // 2
        elif l[mid] < n:
            start = mid + 1
            mid = (start+end) // 2
    return False

t = int(sys.stdin.readline())
target = [int(i) for i in sys.stdin.readline().split()]
n = int(sys.stdin.readline())
integer = [int(i) for i in sys.stdin.readline().split()]

target = sorted(target)
for i in range(n):
    a = find(integer[i],target)
        
    if not a: print(0)
    elif a: print(1)