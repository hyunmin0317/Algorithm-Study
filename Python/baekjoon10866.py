import sys

input = sys.stdin.readline
deque = []
for i in range(int(input())):
    cmd = input().split()
    if len(cmd) == 2:
        if cmd[0] == 'push_back':
            deque.append(cmd[1])
        else:
            deque.insert(0, cmd[1])
    else:
        cmd = cmd[0]

        if cmd == 'size':
            print(len(deque))
        elif cmd == 'empty':
            if deque:
                print(0)
            else:
                print(1)
        else:
            if deque:
                if cmd == 'front':
                    print(deque[0])
                elif cmd == 'back':
                    print(deque[-1])
                elif cmd == 'pop_front':
                    print(deque.pop(0))
                else:
                    print(deque.pop())
            else:
                print(-1)
