qnt = int(input())
output = []

for i in range(qnt):
    n = int(input())
    primo = True
    for j in range(2, n//2 + 1):
        if n % j == 0:
            primo = False
            break
    
    if primo:
        output.append(f'{n} eh primo')
    else:
        output.append(f'{n} nao eh primo')

for i in output:
    print(i)
