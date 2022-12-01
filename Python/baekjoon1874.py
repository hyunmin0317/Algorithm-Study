n, idx = int(input()), 1
stack, results = [], []

for _ in range(n):
    num = int(input())
    while idx <= num:
        stack.append(idx)
        results.append('+')
        idx += 1
    if stack[-1] == num:
        stack.pop()
        results.append('-')
    else:
        results = []
        break

if results:
    for result in results:
        print(result)
else:
    print('NO')
