dic = {']': '[', ')': '('}
for _ in range(int(input())):
    word, stack = input(), []
    for w in word:
        if w == '[' or w == '(':
            stack.append(w)
        elif w == ']' or w == ')':
            if stack and stack[-1] == dic[w]:
                stack.pop()
            else:
                stack.append(w)
                break
    if stack:
        print('NO')
    else:
        print('YES')
