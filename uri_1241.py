n = int(input())

for qnt in range(n):
    a, b = input().split()

    if b[::-1] == a[:(len(b)*-1)-1:-1]:
        print('encaixa')
    else:
        print('nao encaixa')
