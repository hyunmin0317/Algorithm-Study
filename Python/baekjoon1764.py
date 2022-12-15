N, M = map(int, input().split())
stranger1, stranger2 = set(), set()
for _ in range(N):
    stranger1.add(input())
for _ in range(M):
    stranger2.add(input())
answers = sorted(list(stranger1 & stranger2))
print(len(answers))
print('\n'.join(answers))
