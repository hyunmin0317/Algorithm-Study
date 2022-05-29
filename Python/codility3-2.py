def solution(A):
    N = len(A)
    ans = [True for i in range(N+2)]

    for num in A:
        ans[num] = False

    for i in range(1, N+2):
        if ans[i]:
            return i