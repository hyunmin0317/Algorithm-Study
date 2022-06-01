N, K = map(int, input().split())
list = map(int, input().split())

N-=1
K-=1
if N % K == 0:
	print(N//K)
else:
	print(N//K+1)