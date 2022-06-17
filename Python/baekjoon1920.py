N = int(input())
arr = list(map(int, input().split()))
M = int(input())
ans = list(map(int, input().split()))

for num in ans:
    if num in arr:
        print(1)
    else:
        print(0)