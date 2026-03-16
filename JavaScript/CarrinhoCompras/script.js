let carrinho = [];

function adicionar(){

let produto = document.getElementById("produto").value;
let preco = parseFloat(document.getElementById("preco").value);

carrinho.push({nome: produto, preco: preco});

alert("Produto adicionado!");
}

function mostrarCarrinho(){

let lista = "";
let total = 0;

for(let i = 0; i < carrinho.length; i++){

lista += carrinho[i].nome + " - R$ " + carrinho[i].preco + "<br>";

total += carrinho[i].preco;
}

let quantidade = carrinho.length;

document.getElementById("resultado").innerHTML =
"<b>Produtos:</b><br>" +
lista +
"<br>Total da compra: R$ " + total.toFixed(2) +
"<br>Quantidade de produtos: " + quantidade;

}