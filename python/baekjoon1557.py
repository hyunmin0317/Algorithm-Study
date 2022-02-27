def count(n):
    cnt, i = 0, 1
    while(i**2 <= n):
        cnt += mobius[i] * (n // i**2)
        i+=1
    return cnt

MAX = 1000001
mobius = [0 for i in range(MAX)]
mobius[1] = 1
for i in range(1, MAX):
    for j in range(2*i, MAX, i):
        mobius[j] -= mobius[i]

k = int(input())
left, right = 0, k * 2
while left != right:
    mid = (left+right)//2
    if count(mid) >= k:
        right = mid
    else:
        left = mid+1
print(left)