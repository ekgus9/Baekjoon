import sys

n = int(sys.stdin.readline())

for i in range(n):
    t = int(sys.stdin.readline())
    if t ==1: print(1)
    elif t==2: print(1)
    elif t==3: print(1)
    else:
        n1 = 1
        n2 = 1
        n3 = 1

        for i in range(t-3):
            op = n3
            n3 = n1 + n2
            n1 = n2
            n2 = op

        print(n3)