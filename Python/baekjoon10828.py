import sys

input = sys.stdin.readline
stack = []
N = int(input())

for i in range(N):
    cmd = input().split()

    if len(cmd) == 2:
        stack.append(cmd[1])
    else:
        cmd = cmd[0]

        if cmd == 'size':
            print(len(stack))
        elif cmd == 'empty':
            if stack:
                print(0)
            else:
                print(1)
        else:
            if stack:
                if cmd == 'top':
                    print(stack[-1])
                else:
                    print(stack.pop())
            else:
                print(-1)