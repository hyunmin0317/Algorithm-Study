def solution(N):
    cnt = 2
    for num in range(2, N):
        if N % num == 0:
            cnt += 1
    return cnt