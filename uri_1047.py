h_i, m_i, h_f, m_f = map(lambda i: int(i), input().split())
ini = h_i * 60 + m_i
fin = h_f * 60 + m_f
r = fin - ini
r += 1440 if r <= 0 else 0
horas = r // 60
minutos = r % 60
print(f'O JOGO DUROU {horas} HORA(S) E {minutos} MINUTO(S)')
