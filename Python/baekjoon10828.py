import sys

input = sys.stdin.readline
stack = []
for _ in range(int(input())):
    cmd = input().split()
    if len(cmd) == 2:
        stack.append(cmd[1])
    else:
        if cmd[0] == 'size':
            print(len(stack))
        elif cmd[0] == 'empty':
            if stack:
                print(0)
            else:
                print(1)
        else:
            if stack:
                if cmd[0] == 'pop':
                    print(stack.pop())
                else:
                    print(stack[-1])
            else:
                print(-1)
