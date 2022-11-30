dic = {']': '[', ')': '('}
while True:
    word, stack = input(), []
    if word == '.':
        break
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
        print('no')
    else:
        print('yes')
