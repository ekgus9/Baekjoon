import sys

n = int(sys.stdin.readline())
ss = [int(i) for i in sys.stdin.readline().split()]

start = 1
l = [ss[0]]

for j in ss:
    if j > l[start-1]: 
        l.append(j)
        start += 1
    elif j < l[start-1]:
        left = 0
        right = len(l)
        
        while right > left:
            mid = (right+left) // 2
            if l[mid] < j:
                left = mid + 1
            else: right = mid
            
        l[right] = j
    
print(len(l))