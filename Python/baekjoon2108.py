from collections import Counter

nums = []
N = int(input())
for _ in range(N):
    nums.append(int(input()))
nums.sort()

print(round(sum(nums)/N))
print(nums[int((N-1)/2)])
counter = Counter(nums).most_common()
if len(counter) > 1 and counter[0][1] == counter[1][1]:
    print(counter[1][0])
else:
    print(counter[0][0])
print(nums[-1]-nums[0])
