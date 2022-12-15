N, K = map(int, input().split())
coins, cnt = [], 0

for _ in range(N):
    coins.append(int(input()))
coins.sort(reverse=True)

for coin in coins:
    if K >= coin:
        cnt += K // coin
        K %= coin
print(cnt)
