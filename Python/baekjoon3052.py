cnt = [0] * 42

for i in range(10):
    num = int(input())
    cnt[num%42] = 1
print(sum(cnt))
