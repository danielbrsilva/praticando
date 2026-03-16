musicas = []

while True:

    print("\nMenu")
    print("1 - Adicionar música")
    print("2 - Remover música")
    print("3 - Listar músicas")
    print("4 - Sair")

    opcao = input("Escolha: ")

    if opcao == "1":
        musica = input("Nome da música: ")
        musicas.append(musica)

    elif opcao == "2":
        musica = input("Nome da música para remover: ")
        if musica in musicas:
            musicas.remove(musica)
            print("Música removida!")
        else:
            print("Música não encontrada")

    elif opcao == "3":
        print("\nLista de músicas:")
        for m in musicas:
            print("-", m)

    elif opcao == "4":
        break