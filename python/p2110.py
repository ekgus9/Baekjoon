import sys

N, C = map(int,sys.stdin.readline().split())
x = [int(sys.stdin.readline()) for _ in range(N)]

x.sort()
start = 1
end = x[-1] - x[0]
result = 0

while start <= end:
    mid = (start + end) // 2
    count = 1
    c = x[0]
    
    for i in range(1,len(x)):
        if x[i] >= mid + c:
            count += 1
            c = x[i]
            
    if count >= C:
        start = mid + 1
        result = mid
    else:
        end = mid - 1

print(result)