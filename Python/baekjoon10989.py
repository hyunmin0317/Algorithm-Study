import sys

N = int(sys.stdin.readline())
M = 10001
list = [0] * M

for i in range(N):
    list[int(sys.stdin.readline())] += 1

for i in range(M):
    if list[i] != 0:
        for _ in range(list[i]):
            print(i)