import random

opcoes = ["pedra", "papel", "tesoura"]

usuario = input("Escolha pedra, papel ou tesoura: ").lower()
computador = random.choice(opcoes)

print("Computador escolheu:", computador)

if usuario == computador:
    print("Empate!")

elif (usuario == "pedra" and computador == "tesoura") or \
     (usuario == "tesoura" and computador == "papel") or \
     (usuario == "papel" and computador == "pedra"):
    print("Você venceu!")

else:
    print("Computador venceu!")