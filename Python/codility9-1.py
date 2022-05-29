def solution(A):
    ans = 0
    m = 0
    for i in range(len(A)-2, -1, -1):
        m = max(m, A[i+1])
        n = m - A[i]
        if ans < n:
            ans = n
    return ans