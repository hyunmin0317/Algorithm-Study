N, persons = int(input()), []
for _ in range(N):
    persons.append(list(input().split()))
persons.sort(key=lambda x: int(x[0]))

for person in persons:
    print(person[0], person[1])
