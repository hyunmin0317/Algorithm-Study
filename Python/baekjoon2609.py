n, m = map(int, input().split())

gcf = 1
for num in range(1, max(n,m)+1):
    if n % num == 0 and m % num == 0:
        gcf = num
lcm = n * m // gcf

print(gcf)
print(lcm)