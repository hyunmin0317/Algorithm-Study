import sys
input = sys.stdin.readline

N, M = int(input()), 10001
num = [0] * M

for i in range(N):
    num[int(input())] += 1

for i in range(M):
    if num[i] != 0:
        for _ in range(num[i]):
            print(i)
