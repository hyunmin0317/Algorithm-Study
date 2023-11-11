import sys
sys.setrecursionlimit(10000)

def dfs(x, y):
    if x < 0 or x >= N or y < 0 or y >= M:
        return False
    if field[x][y] == 1:
        field[x][y] = 0
        dfs(x - 1, y)
        dfs(x + 1, y)
        dfs(x, y - 1)
        dfs(x, y + 1)
        return True
    return False

T = int(input())
for _ in range(T):
    M, N, K = map(int, input().split())
    field = [[0] * M for _ in range(N)]
    for _ in range(K):
        y, x = map(int, input().split())
        field[x][y] = 1

    count = 0
    for i in range(N):
        for j in range(M):
            if dfs(i, j) == True:
                count += 1

    print(count)
