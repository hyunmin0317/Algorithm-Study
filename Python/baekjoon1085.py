xywh = list(map(int, input().split()))
xywh[2]-=xywh[0]
xywh[3]-=xywh[1]
print(min(xywh))
