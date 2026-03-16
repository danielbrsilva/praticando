alunos = []

print("Cadastre os alunos no sistema")
print("")

while True:

    nome = input("Nome do aluno: ")
    nota = float(input("Nota do aluno: "))

    alunos.append({"nome": nome, "nota": nota})

    continuar = input("Cadastrar outro aluno? (s/n): ")

    if continuar.lower() != "s":
        break

print("\nLista de alunos:")

soma = 0
maior_nota = 0
melhor_aluno = ""

for aluno in alunos:

    print(aluno["nome"], "-", aluno["nota"])

    soma += aluno["nota"]

    if aluno["nota"] > maior_nota:
        maior_nota = aluno["nota"]
        melhor_aluno = aluno["nome"]

media = soma / len(alunos)

print("\nMédia da turma:", round(media,2))
print("Melhor aluno:", melhor_aluno, "-", maior_nota)