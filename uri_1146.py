while True:
    n = int(input())

    if n == 0:
        break

    g = (i for i in range(1, n))

    for i in g:
        print(i, end=' ')
    print(n)
