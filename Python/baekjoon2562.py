max, idx = int(input()), 1
for i in range(2, 10):
    num = int(input())
    if num > max:
        max, idx = num, i
print(max)
print(idx)
