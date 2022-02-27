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
min, max = map(int, input().split())
print(count(max)-count(min-1))