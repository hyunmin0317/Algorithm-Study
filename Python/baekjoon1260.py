from collections import deque

def dfs(v):
    print(v, end=' ')
    visited[v] = True
    for i in range(1, N + 1):
        if not visited[i] and graph[v][i] == 1:
            dfs(i)

def bfs(v):
    queue = deque([v])
    visited[v] = False
    while queue:
        v = queue.popleft()
        print(v, end=' ')
        for i in range(1, N + 1):
            if visited[i] and graph[v][i] == 1:
                queue.append(i)
                visited[i] = False

N, M, V = map(int, input().split())
graph = [[0] * (N + 1) for _ in range(N + 1)]
visited = [False] * (N + 1)

for _ in range(M):
    a, b = map(int, input().split())
    graph[a][b] = graph[b][a] = 1

dfs(V)
print()
bfs(V)
