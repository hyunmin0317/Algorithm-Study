word = input()
arr = [0] * 26

for w in word:
    if w > 'Z':
        arr[ord(w)-ord('a')] += 1
    else:
        arr[ord(w)-ord('A')] += 1

M = max(arr)
cnt = 0
idx = 0

for i, a in enumerate(arr):
    if a == M:
        idx = i
        cnt += 1

if cnt > 1:
    print('?')
else:
    print(chr(ord('A')+idx))