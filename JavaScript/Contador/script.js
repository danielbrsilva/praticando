function contar(){

let texto = document.getElementById("texto").value;

let palavras = texto.trim().split(/\s+/);

let total = texto.trim() === "" ? 0 : palavras.length;

document.getElementById("resultado").innerText =
"Total de palavras: " + total;

}