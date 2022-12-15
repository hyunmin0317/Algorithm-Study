N, M = map(int, input().split())
dic = {}

for _ in range(N):
    key, value = input().split()
    dic[key] = value
for _ in range(M):
    print(dic[input()])
