def merge_sort(start, end):
    count = 0
    if start < end:
        mid = (start + end) // 2
        count += (merge_sort(start, mid) + merge_sort(mid + 1, end))

        a, b = start, mid + 1
        temp = []

        while a <= mid and b <= end:
            if numbers[a] <= numbers[b]:
                temp.append(numbers[a])
                a += 1
            else:
                temp.append(numbers[b])
                b += 1
                count += (mid - a + 1)

        if a <= mid:
            temp += numbers[a:mid + 1]
        if b <= end:
            temp += numbers[b:end + 1]

        for i in range(len(temp)):
            numbers[start + i] = temp[i]
    return count

N = int(input())
numbers = list(map(int, input().split()))
count = merge_sort(0, N - 1)
print(count)