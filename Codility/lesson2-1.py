def solution(A, K):
    N = len(A)
    if K <= N:
        K = K % N
    ans = A[N-K:]+A[:N-K]
    return ans