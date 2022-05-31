import sys
input = sys.stdin.readline
from collections import deque
import copy
import itertools

def main() :
    num = int(input())
    arr = list(map(int ,input().split()))
    if num < 3 :
        print("NO")
    elif num == 3 :
        arr.sort()
        if arr[0] == arr[1] or arr[1] == arr[2] :
            print("NO")
        else :
            print("YES")
    else :
        checkarr = list(itertools.combinations(arr,3))
        for s in checkarr :
            tmp = list(s)
            tmp.sort()
            if tmp[0] == tmp[1] or tmp[1] == tmp[2] :
                continue
            else :
                print("YES")
                return
        print("NO")

main()