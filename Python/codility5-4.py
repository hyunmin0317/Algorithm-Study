def solution(A):
    minAvg = (A[0] + A[1]) / 2
    minIndex = 0
    for i in range(2, len(A)):
        avg = (A[i - 2] + A[i - 1] + A[i]) / 3
        if (minAvg > avg):
            minAvg = avg
            minIndex = i - 2

        avg = (A[i - 1] + A[i]) / 2
        if (minAvg > avg):
            minAvg = avg
            minIndex = i - 1
    return minIndex