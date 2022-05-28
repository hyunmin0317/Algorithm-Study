from math import sqrt

def solution(N):
    cnt = 0
    for num in range(1, int(sqrt(N))+1):
        if N % num == 0:
            if num * num == N:
                cnt += 1
            else:
                cnt += 2
    return cnt