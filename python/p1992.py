import sys

def cut(p):
    spl = [j for i in p for j in i]
    t = True
    global r
    for i in spl:
        if i != spl[0]: t = False ; break  
    if t:
        if spl[0] == '0': r = r+'0'
        else : r = r+'1'
        return

    nn = len(p)
    r += '(' ; cut([p[i][0:nn//2] for i in range(0,nn//2)])
    cut([p[i][nn//2:nn] for i in range(0,nn//2)])
    cut([p[i][0:nn//2] for i in range(nn//2,nn)])
    cut([p[i][nn//2:nn] for i in range(nn//2,nn)]) ; r += ')'

n = int(sys.stdin.readline())
box = []
r = ""
for i in range(n):
    box.append(sys.stdin.readline().rstrip())
cut(box)
print(r)