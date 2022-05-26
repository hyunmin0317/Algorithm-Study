def solution(N):
    cnt, ans = 0, 0
    check = False

    while N != 0:
        if N % 2 == 1:
            if check:
                if ans < cnt:
                    ans = cnt
            else:
                check = True
            cnt = 0
        else:
            cnt+=1
        N //= 2
    return ans