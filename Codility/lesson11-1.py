def solution(A):
    N = len(A)
    ans = [0 for _ in range(N)]

    for i in range(N):
        num = A[i]
        for j in range(N):
            if num % A[j] != 0:
                ans[i] += 1
    return ans