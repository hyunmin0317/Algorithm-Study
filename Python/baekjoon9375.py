for _ in range(int(input())):
    wears, ans = {}, 1
    for _ in range(int(input())):
        _, wear = input().split()
        if wear in wears:
            wears[wear] += 1
        else:
            wears[wear] = 1
    for wear in wears:
        ans *= (wears[wear] + 1)
    print(ans-1)
