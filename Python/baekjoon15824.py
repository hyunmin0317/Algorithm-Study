MOD = 1000000007
N = int(input())
arr = sorted(list(map(int, input().split())))
answer = 0

for i in range(N):
    answer += arr[i] * (pow(2, i) - pow(2, N - i - 1))

print(answer % MOD)
