def check(ps):
    stack = []
    for p in ps:
        if p == '(':
            stack.append(p)
        else:
            if stack:
                if '(' != stack.pop():
                    return False
            else:
                return False
    return len(stack) == 0


T = int(input())

for i in range(T):
    if check(input()):
        print('YES')
    else:
        print('NO')