N, persons = int(input()), []
for _ in range(N):
    persons.append(list(map(int, input().split())))

for i in range(N):
    cnt = 1
    for j in range(N):
        if persons[i][0] < persons[j][0] and persons[i][1] < persons[j][1]:
            cnt += 1
    print(cnt, end=' ')
