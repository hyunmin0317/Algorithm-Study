def solution(n):
    cnt, num = 0, 666
    while True:
        if '666' in str(num):
            cnt += 1
        if cnt == n:
            return num
        num += 1

N = int(input())
print(solution(N))
