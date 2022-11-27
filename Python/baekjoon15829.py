L, word = int(input()), input()
sum, r = 0, 1

for s in word:
    sum += (ord(s)-ord('a')+1) * r
    r *= 31
print(sum % 1234567891)
