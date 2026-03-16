let saldo = 1000;

function verSaldo(){
    document.getElementById("resultado").innerText =
    "Saldo atual: R$ " + saldo;
}

function depositar(){
    let valor = parseFloat(prompt("Digite o valor para depositar:"));

    if(valor > 0){
        saldo += valor;
        alert("Depósito realizado!");
        verSaldo();
    }else{
        alert("Valor inválido");
    }
}

function sacar(){
    let valor = parseFloat(prompt("Digite o valor para sacar:"));

    if(valor > saldo){
        alert("Saldo insuficiente!");
    }else{
        saldo -= valor;
        alert("Saque realizado!");
        verSaldo();
    }
}