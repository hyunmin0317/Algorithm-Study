def solution(S, P, Q):
    ans = []
    arr = []
    dic = {'A':1, 'C':2, 'G':3, 'T':4}

    for char in S:
        arr.append(dic[char])

    for i in range(len(P)):
        s = P[i]
        e = Q[i]+1
        ans.append(min(arr[s:e]))

    return ans