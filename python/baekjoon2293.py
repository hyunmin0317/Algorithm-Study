list = []
answer = [1]
n, sum = map(int, input().split())

for i in range(n):
    list.append(int(input()))
for i in range(sum):
    answer.append(0)

for num in list:
    for s in range(1, sum+1):
        if s >= num:
            answer[s] += answer[s-num]

print(answer[sum])