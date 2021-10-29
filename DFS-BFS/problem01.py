def solution(numbers, target):
    answer = 0
    leaves = [0]
    for num in numbers:
        tmp = []
        for parent in leaves:
            tmp.append(parent + num)
            tmp.append(parent - num)
        leaves = tmp
    for leaf in leaves:
        if leaf == target:
            answer += 1
    return answer

def main():
    arr = [1,1,1,1,1]
    print(arr)
    print(solution(arr, 3))

if __name__ == "__main__":
	main()