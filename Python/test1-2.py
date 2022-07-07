def solution(S, K):
    length = 0
    ans = 0
    arr = []

    for word in S.split():
        arr.append(len(word))

    for i in range(0, len(arr)):

        if arr[i] > K:
            return -1

        l = arr[i] + 1
        length += l

        if length > K:
            ans += 1
            length = arr[i]
    return ans


print(solution("SMS messages are re short", 12))
print(solution("SMmessagesmessagesmessagesS messages are re short", 12))