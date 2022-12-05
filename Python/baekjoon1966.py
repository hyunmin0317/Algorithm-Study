from collections import deque

for _ in range(int(input())):
    N, M = map(int, input().split())
    queue, count = deque(list(map(int, input().split()))), 0
    while queue:
        best, front = max(queue), queue.popleft()
        M -= 1
        if best == front:
            count += 1
            if M < 0:
                print(count)
                break
        else:
            queue.append(front)
            if M < 0:
                M = len(queue) - 1
