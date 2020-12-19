qnt = int(input())

cobaias = []

coelhos, ratos, sapos, total = 0, 0, 0, 0

for i in range(qnt):
    linha = input().split()
    cobaias.append((int(linha[0]), linha[1]))

for i in cobaias:
    total += i[0]

    if i[1] == 'C':
        coelhos += i[0]
    elif i[1] == 'R':
        ratos += i[0]
    else:
        sapos += i[0]

print(f'Total: {total:d} cobaias')
print(f'Total de coelhos: {coelhos:d}')
print(f'Total de ratos: {ratos:d}')
print(f'Total de sapos: {sapos:d}')
print(f'Percentual de coelhos: {coelhos*100/total:.2f} %')
print(f'Percentual de ratos: {ratos*100/total:.2f} %')
print(f'Percentual de sapos: {sapos*100/total:.2f} %')
