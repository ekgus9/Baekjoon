from sys import stdin

def score1(i): 
    global result
    result += 3 * A[i]
    A[i] = 0
        
def score2(i): 
    global result
    m = min(A[i],A[i+1])
    result += 5 * m
    A[i] -= m ; A[i+1] -= m
    
def score3(i):
    global result
    m = min(A[i],A[i+1],A[i+2])
    result += 7 * m
    A[i] -= m ; A[i+1] -= m ; A[i+2] -= m
        
N = int(stdin.readline())
A = [int(i) for i in stdin.readline().split()]
result = 0
R = [0 for i in range(N)]

for i in range(N-2):
    if (A[i] != 0) and (A[i+1] !=0) and (A[i+2] != 0): 
        if A[i+1] > A[i+2] : 
            m = min(A[i],A[i+1]-A[i+2])
            result += 5 * m
            A[i] -= m ; A[i+1] -= m
        score3(i)
    
for i in range(N-1):
    if A[i] != 0 and A[i+1] !=0 : score2(i)
    
for i in range(N):score1(i)

print(result)