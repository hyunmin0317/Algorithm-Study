dp = [0] * 101
dp[1], dp[2], dp[3] = 1, 1, 1
for i in range(0, 98):
    dp[i+3] = dp[i] + dp[i+1]
for _ in range(int(input())):
    print(dp[int(input())])
