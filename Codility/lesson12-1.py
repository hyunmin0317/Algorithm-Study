def solution(N, M):
    visit = [0 for _ in range(N)]
    cnt, num = 0, 0

    while(1):
        if visit[num]:
            break
        else:
            visit[num] = 1
            num = (num + M) % N
            cnt += 1
    return cnt