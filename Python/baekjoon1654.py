K, N = map(int, input().split())
lengths = []
for _ in range(K):
    lengths.append(int(input()))

left, right = 1, max(lengths)
while left <= right:
    mid, value = (left+right) // 2, 0
    for length in lengths:
        value += length // mid
    if value >= N:
        left = mid + 1
    else:
        right = mid - 1
print(right)
