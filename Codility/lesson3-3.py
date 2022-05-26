def solution(A):
    total = sum(A)
    a = A[0]
    min = abs(2*a-total)

    for i in range(1, len(A)-1):
        a += A[i]
        ans = abs(2*a-total)
        if min > ans:
            min = ans
    return min