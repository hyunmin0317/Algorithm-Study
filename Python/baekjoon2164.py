from collections import deque

cards = deque(range(1, int(input()) + 1))
while True:
    card = cards.popleft()
    if cards:
        cards.append(cards.popleft())
    else:
        break
print(card)
