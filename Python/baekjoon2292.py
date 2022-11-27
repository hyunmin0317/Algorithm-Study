N, ans = int(input()), 1

while True:
    if N <= (ans**2-ans) * 3 + 1:
        break
    ans += 1
print(ans)
