saldo = 1000

while True:
    print("\n--- Caixa Eletrônico ---")
    print("1 - Ver saldo")
    print("2 - Depositar")
    print("3 - Sacar")
    print("4 - Sair")

    opcao = input("Escolha uma opção: ")

    if opcao == "1":
        print("Saldo atual: R$", saldo)

    elif opcao == "2":
        valor = float(input("Digite o valor do depósito: "))
        saldo += valor
        print("Depósito realizado!")

    elif opcao == "3":
        valor = float(input("Digite o valor do saque: "))
        
        if valor > saldo:
            print("Saldo insuficiente!")
        else:
            saldo -= valor
            print("Saque realizado!")

    elif opcao == "4":
        print("Saindo do sistema...")
        break

    else:
        print("Opção inválida!")