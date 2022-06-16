N, K = map(int, input().split())
list = [i for i in range(1, N+1)]
index = K-1

print('<', end='')
while len(list) != 1:
    N-=1
    print(list[index], end=', ')
    del list[index]
    index = (index + K-1) % N
print(f'{list[0]}>')