from collections import deque


def bfs(maze, visited, N, M):
    directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
    queue = deque([(0, 0, 1)])
    visited[0][0] = True
    while queue:
        row, col, count = queue.popleft()
        if row == N - 1 and col == M - 1:
            return count
        for dr, dc in directions:
            nr, nc = row + dr, col + dc
            if 0 <= nr < N and 0 <= nc < M and maze[nr][nc] == 1 and not visited[nr][nc]:
                queue.append((nr, nc, count + 1))

                visited[nr][nc] = True


N, M = map(int, input().split())
maze = [list(map(int, input())) for _ in range(N)]
visited = [[False] * M for _ in range(N)]

result = bfs(maze, visited, N, M)
print(result)