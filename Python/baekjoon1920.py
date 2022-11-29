import sys

input = sys.stdin.readline
print = sys.stdout.write

N = int(input())
number = list(map(int, input().split()))
M = int(input())
nums = list(map(int, input().split()))

for num in nums:
    print('1\n') if num in number else print('0\n')
