let alunos = [];

function cadastrar(){

let nome = document.getElementById("nome").value;
let nota = parseFloat(document.getElementById("nota").value);

alunos.push({nome: nome, nota: nota});

alert("Aluno cadastrado!");

}

function mostrarDados(){

let lista = "";
let soma = 0;
let maiorNota = 0;
let melhorAluno = "";

for(let i = 0; i < alunos.length; i++){

lista += alunos[i].nome + " - " + alunos[i].nota + "<br>";

soma += alunos[i].nota;

if(alunos[i].nota > maiorNota){
maiorNota = alunos[i].nota;
melhorAluno = alunos[i].nome;
}

}

let media = soma / alunos.length;

document.getElementById("resultado").innerHTML =
"<b>Lista de Alunos</b><br>" +
lista +
"<br>Média da turma: " + media.toFixed(2) +
"<br>Melhor aluno: " + melhorAluno + " (" + maiorNota + ")";

}