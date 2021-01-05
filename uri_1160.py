qnt = int(input())

for n in range(qnt):
    pa, pb, ga, gb = [float(i) for i in input().split()]

    pa = int(pa)
    pb = int(pb)

    ano = 0
    while pa <= pb:
        pa = int(pa*(1 + ga/100))
        pb = int(pb*(1 + gb/100))
        ano += 1
        if ano >= 101:
            print('Mais de 1 seculo.')
            break
    else:
        print(f'{ano} anos.')
