def solution(A):
    dic = {}
    for num in A:
        if num in dic:
            dic[num] += 1
        else:
            dic[num] = 1
    for key in dic.keys():
        if dic[key] % 2 == 1:
            return key