v = list()

for i in range(20):
    v.append(int(input()))

g = (i for i in range(19, 9, -1))

for i, j in enumerate(g):
    v[i], v[j] = v[j], v[i]

for i, j in enumerate(v):
    print(f'N[{i}] = {j}')
