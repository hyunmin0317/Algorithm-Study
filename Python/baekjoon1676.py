N = int(input())
sum, cnt = 1, 0

for num in range(1, N+1):
    sum *= num

while sum % 10 == 0:
    sum //= 10
    cnt += 1
print(cnt)
