preco_hamburguer=12.00
preco_batata=5.00
preco_refrigerante=8.00
quantidade_hamburguer=int(input("Digite a quantidade de hambúrgueres: "))
quantidade_batata=int(input("Digite a quantidade de batatas: "))
quantidade_refrigerante=int(input("Digite a quantidade de refrigerantes: "))

total_hamburguer=preco_hamburguer*quantidade_hamburguer
total_batata=preco_batata*quantidade_batata
total_refrigerante=preco_refrigerante*quantidade_refrigerante

total_compra=total_hamburguer+total_batata+total_refrigerante
print(f"O total da compra é: {total_compra}")