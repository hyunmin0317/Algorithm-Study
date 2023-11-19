import heapq
import sys

heap = []

def max_heap_push(x):
    heapq.heappush(heap, (-x, x))

def max_heap_pop():
    if not heap:
        return 0
    return heapq.heappop(heap)[1]

if __name__ == "__main__":
    N = int(input())
    
    for _ in range(N):
        x = int(sys.stdin.readline().strip())
        if x == 0:
            print(max_heap_pop())
        else:
            max_heap_push(x)
