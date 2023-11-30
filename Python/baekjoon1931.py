cnt, end_time = 0, 0
times = []
n = int(input())

for _ in range(n):
    start, end = map(int, input().split())
    times.append((start, end))
times.sort(key=lambda x: (x[1], x[0]))

for time in times:
    start, end = time
    if start >= end_time:
        cnt += 1
        end_time = end
print(cnt)