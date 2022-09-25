V, E = map(int, input().split())
edges = []
parent = list(range(V + 1))
for _ in range(E):
    edges.append(list(map(int, input().split())))
edges.sort(key=lambda x: x[2])


def find(a):
    if a != parent[a]:
        parent[a] = find(parent[a])
    return parent[a]


ans = 0
for s, e, w in edges:
    s = find(s)
    e = find(e)
    if s != e:
        if s > e:
            parent[s] = e
        else:
            parent[e] = s
        ans += w
print(ans)
