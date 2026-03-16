function converter(){

let total = parseInt(document.getElementById("segundos").value);

let horas = Math.floor(total / 3600);

let minutos = Math.floor((total % 3600) / 60);

let segundos = total % 60;

document.getElementById("resultado").innerText =
horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s)";

}