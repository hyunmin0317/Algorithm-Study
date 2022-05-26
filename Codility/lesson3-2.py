def solution(A):
    N = len(A)
    ans = [True for i in range(N+1)]

    for num in A:
        ans[num] = False

    for i in range(0, N+1):
        if ans[i]:
            return i

print(solution([2,3,1,5]))