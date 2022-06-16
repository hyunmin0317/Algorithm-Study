from functools import cmp_to_key

def compare(x,y):
    if len(x) > len(y):
        return 1
    elif len(x) < len(y):
        return -1
    else:
        if x > y:
            return 1
        elif x < y:
            return -1
        else:
            return 0


N = int(input())
list = []

for i in range(N):
    list.append(input())

sort_list = sorted(set(list), key=cmp_to_key(compare))
for str in sort_list:
    print(str)