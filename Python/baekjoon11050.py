def factorial(n):
    ans = 1
    for i in range(2, n+1):
        ans *= i
    return ans

N, K = map(int, input().split())
ans = factorial(N) // (factorial(K) * factorial(N-K))
print(ans)
