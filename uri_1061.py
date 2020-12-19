dia = input()
tempo = input() 
dia = int(dia.split()[1])
tempo = [int(i) for i in tempo.split(' : ')] 
dia_final = input()
tempo_final = input()
dia_final = int(dia_final.split()[1])
tempo_final = [int(i) for i in tempo_final.split(' : ')] 

soma_inicial = 0
d = 3600
for i in tempo:
    soma_inicial += i * d
    d /= 60
soma_inicial += dia * 86400

soma_final = 0
d = 3600
for i in tempo_final:
    soma_final += i * d
    d /= 60
soma_final += dia_final * 86400

r = soma_final - soma_inicial

print(f'{r//86400:.0f} dia(s)')
r %= 86400
print(f'{r//3600:.0f} hora(s)')
r %= 3600
print(f'{r//60:.0f} minuto(s)')
r %= 60
print(f'{r:.0f} segundo(s)')
