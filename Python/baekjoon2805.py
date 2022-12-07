N, M = map(int, input().split())
lengths = list(map(int, input().split()))

left, right = 1, max(lengths)
while left <= right:
    mid, value = (left+right) // 2, 0
    for length in lengths:
        if length > mid:
            value += (length - mid)
    if value >= M:
        left = mid + 1
    else:
        right = mid - 1
print(right)
