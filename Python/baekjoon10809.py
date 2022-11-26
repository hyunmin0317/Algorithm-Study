alphabet = [-1] * 26

for i, a in enumerate(input()):
    idx = ord(a) - ord('a')
    if alphabet[idx] == -1:
        alphabet[idx] = i

print(' '.join(map(str, alphabet)))
