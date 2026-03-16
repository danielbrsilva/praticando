carrinho = []

while True:

    produto = input("Nome do produto: ")
    preco = float(input("Preço do produto: "))

    carrinho.append({"nome": produto, "preco": preco})

    continuar = input("Adicionar outro produto? (s/n): ")

    if continuar.lower() != "s":
        break

total = 0

print("\nProdutos no carrinho:")

for item in carrinho:

    print(item["nome"], "- R$", item["preco"])
    total += item["preco"]

print("\nTotal da compra: R$", total)
print("Quantidade de produtos:", len(carrinho))