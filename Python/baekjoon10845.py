import sys

input = sys.stdin.readline
queue = []
N = int(input())

for i in range(N):
    cmd = input().split()

    if len(cmd) == 2:
        queue.append(cmd[1])
    else:
        cmd = cmd[0]

        if cmd == 'size':
            print(len(queue))
        elif cmd == 'empty':
            if queue:
                print(0)
            else:
                print(1)
        else:
            if queue:
                if cmd == 'front':
                    print(queue[0])
                elif cmd == 'back':
                    print(queue[-1])
                else:
                    print(queue.pop(0))
            else:
                print(-1)