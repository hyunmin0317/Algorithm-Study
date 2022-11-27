T = int(input())

for i in range(T):
    ans = ''
    R, S = input().split()
    for s in S:
        ans += s * int(R)
    print(ans)
