def sort(arr, N):
    for i in range(1, N):
        for j in range(i, 0, -1):
            if arr[j - 1] + arr[j] < arr[j] + arr[j - 1]:
                arr[j - 1], arr[j] = arr[j], arr[j - 1]

N = int(input())
num = ''
arr = list(input().split())
sort(arr, N)
for n in arr:
    num += n

print(int(num))