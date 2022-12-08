import sys

input = sys.stdin.readline
nums = set()
for _ in range(int(input())):
    cal = input().split()
    if len(cal) == 1:
        if cal[0] == 'all':
            nums = set([num for num in range(1, 21)])
        elif cal[0] == 'empty':
            nums = set()
    else:
        x = int(cal[1])
        if cal[0] == 'add':
            nums.add(x)
        elif cal[0] == 'remove':
            nums.discard(x)
        elif cal[0] == 'check':
            print(1 if x in nums else 0)
        elif cal[0] == 'toggle':
            nums.discard(x) if x in nums else nums.add(x)
