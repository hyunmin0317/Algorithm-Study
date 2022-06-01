N = int(input())
ans = N
problems = input().split()
problems.sort()

for i in range(1, N):
	if problems[i-1] == problems[i]:
		ans-=1

if ans >= 3:
	print("YES")
else:
	print("NO")