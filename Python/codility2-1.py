def solution(A, K):
    N = len(A)
    if N != 0:
        K = K % N
    ans = A[N-K:]+A[:N-K]
    return ans