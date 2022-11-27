N, ans = int(input()), 0

for i in range(N):
    sum = i
    for s in str(sum):
        sum += int(s)
    if N == sum:
        ans = i
        break
print(ans)
