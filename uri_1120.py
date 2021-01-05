while True:
    a, b = input().split()

    if a == '0' and b == '0':
        break

    if a in b:
        b = b.replace(a, '')

    if b == '':
        b = 0

    print(int(b))
