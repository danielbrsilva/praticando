let usuarioCorreto = "admin";
let senhaCorreta = "1234";

let tentativas = 3;

function login(){

let usuario = document.getElementById("usuario").value;
let senha = document.getElementById("senha").value;
let resultado = document.getElementById("resultado");

if(usuario === usuarioCorreto && senha === senhaCorreta){

resultado.innerText = "Acesso permitido";
resultado.style.color = "green";

}else{

tentativas--;

if(tentativas > 0){

resultado.innerText = "Usuário ou senha incorretos. Tentativas restantes: " + tentativas;
resultado.style.color = "orange";

}else{

document.body.innerHTML = `
<h1 style="color:red; text-align:center; margin-top:200px;">
🚫 Conta Bloqueada
</h1>
<p style="text-align:center; font-size:20px;">
Você excedeu o número de tentativas de login.
</p>
`;

}

}

}