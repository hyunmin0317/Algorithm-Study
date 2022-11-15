import sys
import heapq
input = sys.stdin.readline

N = int(input())
left, right, answer = [], [], []

for _ in range(N):
    num = int(input())

    if len(left) == len(right):
        heapq.heappush(left, (-num, num))
    else:
        heapq.heappush(right, (num, num))

    if right and left[0][1] > right[0][0]:
        min = heapq.heappop(right)[0]
        max = heapq.heappop(left)[1]
        heapq.heappush(left, (-min, min))
        heapq.heappush(right, (max, max))
    answer.append(left[0][1])

for ans in answer:
    print(ans)
