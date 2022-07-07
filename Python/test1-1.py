def solution(A):
    ans = 0
    N = len(A)

    for P in range(1, N-1):
        M = len(A[P])
        for Q in range(1, M-1):
            if (A[P][Q-1] > A[P][Q] < A[P][Q+1] and A[P-1][Q] < A[P][Q] > A[P+1][Q]) or (A[P][Q-1] < A[P][Q] > A[P][Q+1] and A[P-1][Q] > A[P][Q] < A[P+1][Q]):
                ans += 1
    return ans

print(solution([[0,1,9,3],
                [7,5,8,3],
                [9, 2, 9, 4],
                [4, 6, 7, 1]
                ]))

print(solution([[]]))