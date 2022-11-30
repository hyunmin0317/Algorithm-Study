N, nums = int(input()), list(map(int, input().split()))
M, checks = int(input()), list(map(int, input().split()))
dic = {}

for num in nums:
    if num in dic:
        dic[num] += 1
    else:
        dic[num] = 1

for check in checks:
    cnt = 0
    if check in dic:
        cnt = dic[check]
    print(cnt, end=' ')
