nums, sum = list(map(int, input().split())), 0

for num in nums:
    sum += num ** 2

print(sum % 10)
