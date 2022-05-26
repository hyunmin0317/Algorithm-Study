def solution(N):
    number = ""
    max = 0

    while N != 0:
        number += str(N % 2)
        N //= 2
    arr = number.split('1')

    if number[0] == '0':
        arr = arr[1:]

    if len(set(arr)) != 0:
        for num in arr:
            length = len(num)
            max = length if max < length else max
    return max