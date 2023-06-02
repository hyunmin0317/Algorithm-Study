import sys
input = sys.stdin.readline

N, M = map(int, input().split())
nums = list(map(int, input().split()))
dp, sum = [0], 0

for num in nums:
    sum += num
    dp.append(sum)

for _ in range(M):
    i, j = map(int, input().split())
    print(dp[j] - dp[i-1])
