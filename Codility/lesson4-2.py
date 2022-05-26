def solution(A):
    A.sort()
    past = 0

    for num in A:
        if num - past != 1:
            return 0
        past = num
    return 1