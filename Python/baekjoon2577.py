num = str(int(input()) * int(input()) * int(input()))
nums = [0] * 10

for n in num:
    nums[int(n)] += 1

for n in nums:
    print(n)
