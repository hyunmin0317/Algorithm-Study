from functools import cmp_to_key

def compare(A,B):
    if A[0] > B[0]:
        return 1
    elif A[0] < B[0]:
        return -1
    else:
        if A[1] >= B[1]:
            return 1
        else:
            return -1


N = int(input())
arr = []

for i in range(N):
    arr.append(list(map(int, input().split())))

sort_list = sorted(arr, key=cmp_to_key(compare))
for point in sort_list:
    print(f'{point[0]} {point[1]}')