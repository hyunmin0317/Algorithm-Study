def binary_search(left, right, target):
    while left < right:
        mid = (left + right) // 2
        if lis[mid] < target:
            left = mid + 1
        else:
            right = mid

    return right

N = int(input())
numbers = list(map(int, input().split()))
lis = [numbers[0], ]

for i in range(1, N):
    if lis[-1] < numbers[i]:
        lis.append(numbers[i])
    else:
        idx = binary_search(0, len(lis)-1, numbers[i])
        lis[idx] = numbers[i]

print(lis)
print(len(lis))