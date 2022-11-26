N = int(input())
scores = list(map(int, input().split()))
ans = sum(scores) / max(scores) * 100 / N
print(ans)
