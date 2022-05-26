def solution(A, B, K):
    ans = B // K - A // K
    if A % K == 0:
        ans += 1
    return ans