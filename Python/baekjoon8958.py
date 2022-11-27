T = int(input())

for i in range(T):
    result = input()
    sum, score = 0, 0
    for r in result:
        if r == 'O':
            score += 1
        else:
            score = 0
        sum += score
    print(sum)
