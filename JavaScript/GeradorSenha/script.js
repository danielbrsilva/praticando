function gerarSenha(){

let tamanho = document.getElementById("tamanho").value;

let caracteres =
"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*";

let senha = "";

for(let i = 0; i < tamanho; i++){

let indice = Math.floor(Math.random() * caracteres.length);

senha += caracteres[indice];

}

document.getElementById("resultado").innerText =
"Senha gerada: " + senha;

}