def solution(A):
    A.sort()
    ans = 1

    for num in A:
        if ans == num:
            ans+=1
    return ans