N, M, B = map(int, input().split())
grounds = [list(map(int, input().split())) for _ in range(N)]
time, height = 2e9, 0

for h in range(min(min(grounds)), max(max(grounds)) + 1):
    use, take = 0, 0
    for ground in grounds:
        for g in ground:
            if g > h:
                take += g - h
            else:
                use += h - g
    if use <= B + take:
        t = take * 2 + use
        if t <= time:
            time, height = t, h
print(time, height)
