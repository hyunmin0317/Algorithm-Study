def solution(S):
    dic = {')':'(', ']':'[', '}':'{'}
    stack = []
    for s in S:
        stack.append(s)

        if s in dic.keys():
            stack.pop()
            if len(stack) == 0:
                return 0
            p = stack.pop()
            if p != dic[s]:
                return 0
    return 1 if len(stack) == 0 else 0