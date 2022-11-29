N, K = map(int, input().split())
circle, removed = [x for x in range(1, N+1)], []
now = K-1

while circle:
    removed.append(circle.pop(now))
    if circle:
        now = ((now-1) + K) % len(circle)
print(f'<{", ".join(map(str,removed))}>')
