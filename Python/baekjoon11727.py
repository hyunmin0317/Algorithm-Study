n, MAX = int(input()), 1001
dp = [0] * MAX
dp[1], dp[2] = 1, 3
for i in range(3, MAX):
    dp[i] = dp[i-1] + 2 * dp[i-2]
print(dp[n]%10007)
