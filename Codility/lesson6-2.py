def solution(A):
    A.sort()

    m = A[-1] * A[-2] * A[-3]
    if A[-1] < 0 or A[0] > 0:
        return m
    else:
        if A[0] < 0 and A[1] > 0:
            return m
        else:
            n = A[0] * A[1] * A[-1]
            return max(m, n)