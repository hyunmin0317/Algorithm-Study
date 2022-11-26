word = input()
alphabet = [0] * 26

for w in word:
    if w > 'Z':
        alphabet[ord(w)-ord('a')] += 1
    else:
        alphabet[ord(w)-ord('A')] += 1

M = max(alphabet)
cnt, idx = 0, 0

for i, a in enumerate(alphabet):
    if a == M:
        idx = i
        cnt += 1

if cnt > 1:
    print('?')
else:
    print(chr(ord('A')+idx))
