n = int(input())
v = [int(i) for i in input().split()]

menor = v[0]
pos = 0

for i, j in enumerate(v):
    if j < menor:
        menor = j
        pos = i

print(f'Menor valor: {menor}')
print(f'Posicao: {pos}')
