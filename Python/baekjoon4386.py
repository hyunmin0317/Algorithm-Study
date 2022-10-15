import sys
import math
input = sys.stdin.readline

def union(x,y):
    x = find(x)
    y = find(y)

    if x < y:
        parent[y] = x
    else:
        parent[y] = x

def find(x):
    if x != parent[x]:
        parent[x] = find(parent[x])
    return parent[x]


n = int(input())
parent = [i for i in range(n + 1)]

stars = []
edges = []
ans = 0

for _ in range(n):
    x, y = map(float, input().split())
    stars.append((x, y))

for i in range(n - 1):
    for j in range(i + 1, n):
        edges.append((i, j, math.sqrt((stars[i][0] - stars[j][0])**2 + (stars[i][1] - stars[j][1])**2)))
edges.sort(key=lambda x: x[2])

for s, e, w in edges:
    s = find(s)
    e = find(e)
    if s != e:
        union(s, e)
        ans += w
print(round(ans, 2))
