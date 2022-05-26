def solution(A):
    arr = []
    sum, ans = 0, 0

    for n in A:
        sum += n
        arr.append(sum)

    for i, n in enumerate(A):
        if not n:
            ans += sum - arr[i]
            if ans > 1e9:
                return -1
    return ans