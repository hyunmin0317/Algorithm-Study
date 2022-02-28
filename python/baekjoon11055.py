N = int(input())
numbers = list(map(int, input().split()))
list = []

for i in range(N):
    list.append(numbers[i])
    for j in range(i):
        if numbers[j] < numbers[i]:
            list[i] = max(list[i], list[j]+numbers[i])
        else:
            list[i] = max(list[i], numbers[i])

print(max(list))