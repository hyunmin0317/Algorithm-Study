def solution1(A):
    N = len(A)
    min = abs(sum(A))

    for i in range(1, N):
        ans = abs(sum(A[:i]) - sum(A[i:]))
        if min > ans:
            min = ans
    return min

def solution(A):
    N = len(A)
    total = abs(sum(A))
    min = total

    for i in range(1, N):
        ans = abs(2*sum(A[:i]) - total)
        if min > ans:
            min = ans
    return min

print(solution([3,1,2,4,3]))