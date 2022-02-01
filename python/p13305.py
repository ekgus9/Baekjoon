import sys

N = int(sys.stdin.readline())
road = [int(i) for i in sys.stdin.readline().split()]
oil = [int(i) for i in sys.stdin.readline().split()]

stop = oil[0]
result = 0

for i in range(N-1):
    if oil[i]< stop: 
        stop = oil[i]
    result += stop * road[i]

print(result)