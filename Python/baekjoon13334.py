points = []
n = int(input())

for _ in range(n):
    point = list(map(int, input().split()))
    point.sort()
    points.append(point)
points.sort()
d = int(input())

ans = 0
for i, point in enumerate(points):
    cnt = 0
    end = point[0] + d
    for j in range(i, len(points)):
        if points[j][1] <= end:
            cnt += 1
    ans = max(ans, cnt)
print(ans)
