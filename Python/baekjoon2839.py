N = int(input())
cnt = [-1 for _ in range(N+1)]
cnt[3] = 1
if 5 <= N:
    cnt[5] = 1

for i in range(6, N+1):
    a, b = cnt[i-3], cnt[i-5]
    if a != -1 or b != -1:
        if a != -1 and b != -1:
            cnt[i] = min(a, b) + 1
        else:
            cnt[i] = max(a, b) + 1
print(cnt[-1])
