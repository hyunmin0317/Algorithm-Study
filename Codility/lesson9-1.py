def solution(A):
    ans = 0
    m = A[-1]
    for i in range(len(A)-2, 0, -1):
        n = max(m, A[i+1]) - A[i]
        if ans < n:
            ans = n
    return ans