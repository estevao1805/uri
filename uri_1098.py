i, j = 0, 1

while i <= 2.00:
    for n in range(3):
        if i == 0.00 or i == 1.00 or i >= 1.99:
            print(f'I={i:.0f} J={j+i:.0f}')
        else:
            print(f'I={i:.1f} J={j+i:.1f}')
        j += 1
    i += 0.20
    j = 1
