def binary_search(lis, target):
    left = 0
    right = len(lis) - 1
    while left < right:
        mid = (left + right) // 2
        if lis[mid] <= target:
            left = mid + 1
        else:
            right = mid
    return right

def solution(S):
    N = len(S)
    ans = [S[0]]

    for i in range(1, N):
        if ans[-1] <= S[i]:
            ans.append(S[i])
        else:
            idx = binary_search(ans, S[i])
            ans[idx] = S[i]
        print(ans)
    return N - len(ans)

print(solution('banaaaaana'))   # aaaaaaa -> 10-7=3
print(solution('bbabaaana'))    # aaaaa -> 9-5=4