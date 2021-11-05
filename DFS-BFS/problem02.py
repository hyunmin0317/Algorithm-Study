computers = [[1, 1, 0], [1, 1, 0], [0, 0, 1]]
result = []
n = len(computers)

for i in range(n):
    for j in range(n):
        if (computers[i][j]):
            result.append([i, j])

print(result)

for r in result:
    print(r)



# array1 = [1, 1]
# array2 = [1, 2]
# array1.extend(array2)
# array1 = set(array1)
#
# print(array1)


