def solution(n, times):
    answer = 0
    left, right = 1, max(times) * n
    while left <= right:
        mid = (left + right) // 2
        people = 0
        for time in times:
            people += mid // time

        if people >= n:
            answer = mid
            right = mid - 1

        elif people < n:
            left = mid + 1

    return answer

def main():
    n = 6
    times = [7,10]
    print(solution(n, times))

if __name__ == "__main__":
	main()