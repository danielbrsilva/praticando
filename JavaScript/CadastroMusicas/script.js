let musicas = [];

function adicionar(){

let nome = document.getElementById("musica").value;

musicas.push(nome);

alert("Música adicionada!");

}

function remover(){

let nome = document.getElementById("musica").value;

let index = musicas.indexOf(nome);

if(index !== -1){

musicas.splice(index,1);

alert("Música removida!");

}else{

alert("Música não encontrada");

}

}

function listar(){

let lista = "";

for(let i = 0; i < musicas.length; i++){

lista += musicas[i] + "<br>";

}

document.getElementById("resultado").innerHTML =
"<b>Lista de músicas:</b><br>" + lista;

}