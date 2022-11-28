A, B, V = map(int, input().split())
ans = 1
V -= A
A -= B
ans += V // A
if V % A != 0:
    ans += 1
print(ans)
