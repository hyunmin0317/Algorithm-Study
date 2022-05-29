def solution(N, A):
    m = 0
    ans = [0] * N

    for idx in A:
        if idx == N+1:
            ans = [m] * N
        else:
            ans[idx-1] += 1
            m = max(m, ans[idx-1])
    return ans