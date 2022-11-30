import sys

input = sys.stdin.readline
queue = []
for i in range(int(input())):
    cmd = input().split()
    if len(cmd) == 2:
        queue.append(cmd[1])
    else:
        if cmd[0] == 'size':
            print(len(queue))
        elif cmd[0] == 'empty':
            if queue:
                print(0)
            else:
                print(1)
        else:
            if queue:
                if cmd[0] == 'front':
                    print(queue[0])
                elif cmd[0] == 'back':
                    print(queue[-1])
                else:
                    print(queue.pop(0))
            else:
                print(-1)
