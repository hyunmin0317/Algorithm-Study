ans = [[0, 0] for _ in range(41)]
ans[0], ans[1] = [1, 0], [0, 1]
for n in range(2, 41):
    ans[n] = [ans[n-1][0] + ans[n-2][0], ans[n-1][1] + ans[n-2][1]]
for _ in range(int(input())):
    print(' '.join(map(str, ans[int(input())])))
