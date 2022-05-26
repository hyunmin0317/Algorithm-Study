def solution(X, A):
    N = len(A)
    ans = set()

    for i in range(N):
        ans.add(A[i])
        if len(ans) == X:
            return i
    return -1