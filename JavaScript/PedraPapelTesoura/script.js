function jogar(escolhaUsuario){

let opcoes = ["pedra", "papel", "tesoura"];

let escolhaComputador = opcoes[Math.floor(Math.random()*3)];

let resultado = "";

if(escolhaUsuario === escolhaComputador){
    resultado = "Empate!";
}
else if(
    (escolhaUsuario === "pedra" && escolhaComputador === "tesoura") ||
    (escolhaUsuario === "tesoura" && escolhaComputador === "papel") ||
    (escolhaUsuario === "papel" && escolhaComputador === "pedra")
){
    resultado = "Você venceu!";
}
else{
    resultado = "Computador venceu!";
}

document.getElementById("resultado").innerHTML =
"Você escolheu: " + escolhaUsuario +
"<br>Computador escolheu: " + escolhaComputador +
"<br><b>" + resultado + "</b>";

}