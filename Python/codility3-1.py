def solution(X, Y, D):
    N = Y - X
    ans = N // D
    if N % D != 0:
        ans += 1
    return ans