def solution(A, B):
    stack = [A[0]]

    for i in range(1, len(A)):
        if B[i-1] and not B[i]:
            stack.pop()
            if A[i] < A[i-1]:
                B[i] = 1
                A[i] = A[i-1]
        stack.append(A[i])
    return len(stack)