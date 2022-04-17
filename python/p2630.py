import sys

def cut(p):
    result = [j for i in p for j in i ]
    tru = result[0]
    t = True
    for e in result:
        if e != tru: t = False ; break
    if t: 
        if tru == 1: global b ; b+=1
        elif tru == 0 : global w ; w+=1
        return
    
    nn= len(p)//2
    cp1 = []
    for i in p[0:nn]:
        cp1.append(i[0:nn])
    cut(cp1) 
    cp2 = []
    for i in p[0:nn]:
        cp2.append(i[nn:len(p)])
    cut(cp2)
    cp3 = []
    for i in p[nn:len(p)]:
        cp3.append(i[0:nn])
    cut(cp3)
    cp4 = []
    for i in p[nn:len(p)]:
        cp4.append(i[nn:len(p)])
    cut(cp4)

n = int(sys.stdin.readline())
paper = []
w = 0
b = 0
for i in range(n):
    paper.append([int(i) for i in sys.stdin.readline().split()])

cut(paper)
    
print(w)
print(b)
    