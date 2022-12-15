N, ans = int(input()), 0
times = list(map(int, input().split()))
times.sort()

for time in times:
    ans += time * N
    N -= 1
print(ans)
