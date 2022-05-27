def avg(A):
    return sum(A) / len(A)


def solution(A):
    N = len(A)
    min = avg(A[0:2])
    idx = -1

    for i in range(0, N - 2):
        for j in range(i + 2, N - 1):
            a = avg(A[i:j])
            if min > a:
                min = a
                idx = i
    return idx