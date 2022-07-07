from collections import Counter

N, M = map(int, input().split())
results = [[0] * N for _ in range(N)]
cnt = 0

for i in range(M):
    s, e = map(int, input().split())
    results[s - 1][e - 1] = 1
    results[e - 1][s - 1] = -1

for i in range(N):
    for j in range(N):
        for k in range(N):
            if results[j][k] == 0:
                if results[j][i] == 1 and results[i][k] == 1:
                    results[j][k] = 1
                elif results[j][i] == -1 and results[i][k] == -1:
                    results[j][k] = -1

for i in range(N):
    if Counter(results[i])[0] == 1:
        cnt += 1
print(cnt)