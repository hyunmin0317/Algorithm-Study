T = int(input())

for i in range(T):
    H, W, N = map(int, input().split())
    h, w = N % H, N // H + 1
    if h == 0:
        h, w = H, N // H
    print('%d%02d' % (h, w))
