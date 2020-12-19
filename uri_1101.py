while True:
    
    a = int(input())
    b = int(input())

    if a == 0 or b == 0:
        break

    if a < b:
        a, b = b, a
    
    soma = 0
    for i in range(a, b+1):
        print(f'{i} ', end='')
    print(f'Sum={soma:d}')
