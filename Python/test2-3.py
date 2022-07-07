def cntmin(list):
    if list[1] - list[0] == 1 and list[2] - list[1] == 1:
        return 0
    elif list[1] - list[0] == 2 or list[2] - list[1] == 2:
        return 1
    else:
        return 2


def cntmax(list):
    return max(list[1] - list[0], list[2] - list[1]) - 1


penguins = list(map(int, input().split()))
penguins.sort()

print(cntmin(penguins))
print(cntmax(penguins))