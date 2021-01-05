from itertools import zip_longest

qnt = int(input())

for n in range(qnt):
    a, b = input().split()

    x = ''
    for i in zip_longest(a, b, fillvalue=''):
        x += ''.join(i)
    print(x)
