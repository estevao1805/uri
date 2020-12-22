qnt = int(input())

for i in range(qnt):
    x, y = map(int, input().split())

    try:
        print(f'{x/y:.1f}')
    except:
        print('divisao impossivel')
