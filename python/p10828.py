from sys import stdin

n = int(stdin.readline())
s = []

for i in range(n):
    st = stdin.readline()
    siz = len(s)
    
    if 'push' in st:
        spl = st.split()
        s.append(int(spl[1]))
    elif 'top' in st: 
        if siz == 0 : print(-1)
        else: print(s[-1])
    elif 'size' in st : print(siz)
    elif 'pop' in st: 
        if siz == 0 : print(-1)
        else : print(s.pop(-1))
    elif 'empty' in st: 
        if siz == 0 : print(1)
        else: print(0)