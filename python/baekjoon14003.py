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
dp = [0,1]

for i in range(1, N):
    if lis[-1] < numbers[i]:
        lis.append(numbers[i])
        dp.append(len(lis))
    else:
        idx = binary_search(0, len(lis)-1, numbers[i])
        dp.append(idx+1)
        lis[idx] = numbers[i]

answer = []
cnt = max(dp)

for i in range(N,-1,-1):
    if cnt == 0:
        break
    if dp[i] == cnt:
        answer.append(numbers[i-1])
        cnt -= 1
answer.reverse()

print(len(lis))
print(*answer)