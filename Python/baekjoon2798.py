N, M = map(int, input().split())
num = list(map(int, input().split()))
ans = 0
for i in range(N):
    for j in range(i + 1, N):
        for k in range(j + 1, N):
            sum = num[i] + num[j] + num[k]
            if sum > M:
                continue
            ans = max(ans, sum)
print(ans)
