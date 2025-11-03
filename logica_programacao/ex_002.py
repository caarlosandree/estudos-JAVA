#variavel valor do ingresso
valor_ingresso=100

#variavel idade do usuario
idade=int(input("Digite a sua idade: "))

#variavel estudante do usuario
estudante=input("Digite se é estudante (s/n): ")
#condição para verificar se o usuario é estudante
if estudante == "s":
    estudante = True
else:
    estudante = False

#condição para verificar se o usuario é menor de idade ou estudante e calcular o valor do ingresso
if idade < 18 or estudante == True:
    valor_ingresso = valor_ingresso * 0.5
else:
    valor_ingresso = valor_ingresso
print(f"O valor do ingresso é: {valor_ingresso}")