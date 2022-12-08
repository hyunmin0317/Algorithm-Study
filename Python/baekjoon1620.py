N, M = map(int, input().split())
dic = {}
for num in range(1, N+1):
    pokemon, num = input(), str(num)
    dic[num], dic[pokemon] = pokemon, num
for _ in range(M):
    print(dic[input()])
