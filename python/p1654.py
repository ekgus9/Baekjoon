import sys

def cut(cm):
    if admit(cm) == needN: return cm
    else:
        return t(0,cm)
    
def t(start, end):
    mid = (end + start) // 2
    premid = -1
    while end - start >= 0:

        if premid == mid : return mid
        if admit(mid) == needN: 
            while admit(mid) == needN:
                mid += 1
            return mid - 1
        elif admit(mid) > needN:
            start = mid ; premid = mid
            mid = (end + start) // 2
        elif admit(mid) < needN:
            end = mid ; premid = mid
            mid = (end + start) // 2
        
def admit(cm):
    n = 0
    for i in havelist:
        n += i // cm
    return n

haveN, needN = map(int, sys.stdin.readline().split())

havelist = []
for i in range(haveN):
    havelist.append(int(sys.stdin.readline()))
    
havelist.sort()

print(cut(havelist[len(havelist)-1]))