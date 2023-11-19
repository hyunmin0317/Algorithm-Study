def divide_paper(paper, n, x, y):
    color = paper[x][y]
    for i in range(x, x + n):
        for j in range(y, y + n):
            if paper[i][j] != color:
                return False
    return True

def count_colors(paper, n, x, y, result):
    if divide_paper(paper, n, x, y):
        result[paper[x][y]] += 1
    else:
        new_n = n // 2
        count_colors(paper, new_n, x, y, result)
        count_colors(paper, new_n, x, y + new_n, result)
        count_colors(paper, new_n, x + new_n, y, result)
        count_colors(paper, new_n, x + new_n, y + new_n, result)

if __name__ == "__main__":
    n = int(input())
    paper = [list(map(int, input().split())) for _ in range(n)]

    result = {0: 0, 1: 0}  # 0은 흰색, 1은 파란색
    count_colors(paper, n, 0, 0, result)

    print(result[0])
    print(result[1])
