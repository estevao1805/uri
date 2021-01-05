ma = []

n = input()

for i in range(12):
    l = []
    for j in range(12):
        l.append(float(input()))
    ma.append(l)

ac = 1
soma = 0
for i in range(11):
    soma += sum(ma[i][ac:])
    ac += 1

if n == 'S':
    print(f'{soma:.1f}')
else:
    print(f'{soma/66:.1f}')
