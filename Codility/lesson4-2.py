def solution(A):
    N = len(A)
    sets = set()

    for num in A:
        if num > N:
            return 0
        sets.add(num)

    if len(sets) == N:
        return 1
    else:
        return 0