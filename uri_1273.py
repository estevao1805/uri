
casos = []

while True:
    n = int(input())

    if n == 0:
        break

    maior = 0
    palavras = []
    for i in range(n):
        p = input()
        palavras.append(p)
        if len(p) > maior:
            maior = len(p)

    for i in range(len(palavras)):
        palavras[i] = f'{palavras[i]: >{maior}s}'
    casos.append(palavras)

for i in range(len(casos)):
    for palavra in casos[i]:
        print(palavra)
    else:
        if i == len(casos)-1:
            break
        else:
            print()
