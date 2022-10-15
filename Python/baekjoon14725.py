words = []
N = int(input())

for _ in range(N):
    word = list(input().split())
    words.append(word[1:])
words.sort()

dash = '--'
for i, word in enumerate(words):
    if i == 0:
        for j, w in enumerate(word):
            print(dash * j + w)
    else:
        idx = 0
        for j, w in enumerate(word):
            if words[i - 1][j] != w or len(words[i - 1]) <= j:
                break
            else:
                idx = j + 1
        for j in range(idx, len(words[i])):
            print(dash * j + words[i][j])
