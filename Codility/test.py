def solution(A):
    ans = 1
    A.sort()

    for num in A:
        if num == ans:
            ans += 1
    return ans