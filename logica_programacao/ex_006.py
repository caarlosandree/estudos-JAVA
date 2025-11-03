distancia=float(input("Digite a distancia em km: "))
velocidade=float(input("Digite a velocidade média em km/h: "))

tempo=distancia/velocidade
tempo_em_minutos=tempo*60
tempo_em_horas=tempo_em_minutos/60
   
print(f"O tempo de viagem é: {tempo_em_minutos} minutos ou {tempo_em_horas} horas")