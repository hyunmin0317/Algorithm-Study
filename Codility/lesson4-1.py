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