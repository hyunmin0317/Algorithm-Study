N, points = int(input()), []
for _ in range(N):
    points.append(list(map(int, input().split())))
points.sort(key=lambda x: (x[1], x[0]))

for point in points:
    print(point[0], point[1])
