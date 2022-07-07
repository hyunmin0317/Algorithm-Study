from collections import deque

N = 10
n, m = -1, -1
sx, sy = -1, -1
dx, dy = [1, -1, 0, 0], [0, 0, 1, -1]
forest = [[1] * N for _ in range(N)]

for i in range(N):
	fore = input()
	for j, f in enumerate(fore):
		if f == 'R':
			forest[i][j] = 0
		elif f == 'H':
			n, m = i, j
		elif f == 'M':
			sx, sy = i, j

queue = deque([(sx, sy)])

while queue:
	x, y = queue.popleft()
	for i in range(4):
		nx, ny = x + dx[i], y + dy[i]
		if 0 <= nx < N and 0 <= ny < N:
			if forest[nx][ny] == 1:
				forest[nx][ny] = forest[x][y] + 1
				queue.append((nx, ny))

print(forest[n][m]-2)