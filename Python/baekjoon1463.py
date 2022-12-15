N = int(input())
dp = [0] * (N + 1)

for num in range(2, N+1):
    value = [(dp[num - 1] + 1)]
    if num % 3 == 0:
        value.append(dp[num // 3] + 1)
    if num % 2 == 0:
        value.append(dp[num // 2] + 1)
    dp[num] = min(value)
print(dp[N])
