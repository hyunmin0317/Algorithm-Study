def solution(X, A):
    N = len(A)
    arr = [False] * X
    cnt = 0

    for i in range(N):
        if not arr[A[i]-1]:
            arr[A[i]-1] = True
            cnt += 1
            if cnt == X:
                return i
    return -1


def solution2(X, A):
    c = [0] * (X)
    s = 0
    for idx, i in enumerate(A):

        if c[i - 1] == 0:
            c[i - 1] = 1
            s += 1
            if s == X:
                return idx
    return -1