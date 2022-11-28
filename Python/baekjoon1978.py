def decimal(n):
    if n == 1:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True


N = int(input())
nums = list(map(int, input().split()))
ans = 0

for num in nums:
    if decimal(num):
        ans += 1
print(ans)
