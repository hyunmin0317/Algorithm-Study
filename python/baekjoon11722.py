N = int(input())
numbers = list(map(int, input().split()))
dp = [1 for i in range(N)]

for i in range(1, N):
    s = []
    for j in range(i):
        if numbers[i] < numbers[j]:
            s.append(dp[j])

    if len(s) == 0:
        continue
    else:
        dp[i] += max(s)

print(max(dp))