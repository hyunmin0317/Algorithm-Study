T = int(input())

for _ in range(T):
    k, n = int(input()), int(input())
    dp = list(range(1, n+1))
    for _ in range(k):
        for i in range(1, n):
            dp[i] += dp[i-1]
    print(dp[n-1])
