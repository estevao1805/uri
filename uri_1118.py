def valida(nota):
    return 0.00 <= nota <= 10.00


nota = []
while True:

    num = float(input())
    if valida(num):
        nota.append(num)

        if len(nota) == 2:
            print(f'media = {sum(nota)/2:.2f}')
            nota = []
            while True:
                d = int(input('novo calculo (1-sim 2-nao)\n'))
                if d < 1 or d > 2:
                    continue
                break
            if d == 2:
                break
    else:
        print('nota invalida')
