while True:
    num, ans = input(), 'yes'
    if num == '0':
        break
    for i, n in enumerate(num):
        if n != num[-i-1]:
            ans = 'no'
            break
    print(ans)
