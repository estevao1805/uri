notas = []

while True:
    nota = float(input())

    if 0.00 <= nota <= 10.00:
        notas.append(nota)
        if len(notas) == 2:
            print(f'media = {sum(notas)/2:.2f}')
            break
    else:
        print('nota invalida')
