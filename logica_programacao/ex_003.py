preco_padrao_entrega=5.00
entrega=input("Digite se deseja entrega (s/n): ")
if entrega == "s":
    tempo=input("Está chovendo? (s/n): ")

    distancia=int(input("Digite a distancia em km: "))
    if tempo == "s":
        if distancia > 5 and distancia <= 10:
            preco_entrega=preco_padrao_entrega+5.00
            print(f"O preço da entrega é: {preco_entrega}")
        elif distancia > 10:
            preco_entrega=preco_padrao_entrega+7.00
            print(f"O preço da entrega é: {preco_entrega}")
        else:
            preco_entrega=preco_padrao_entrega+2.00
            print(f"O preço da entrega é: {preco_entrega}")
    else:
        if distancia > 5 and distancia <= 10:
            preco_entrega=preco_padrao_entrega+3.00
            print(f"O preço da entrega é: {preco_entrega}")
        elif distancia > 10:
            preco_entrega=preco_padrao_entrega+5.00
            print(f"O preço da entrega é: {preco_entrega}")
        else:
            preco_entrega=preco_padrao_entrega
            print(f"O preço da entrega é: {preco_entrega}")
else:
    print("Obrigado por comprar conosco!")