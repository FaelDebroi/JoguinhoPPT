package com.example.jogo_ppt.classes;

// Modificadores de acesso
// 1) public -> todas as classes terão acesso
// 2) private -> apenas pode ser acessodo dentro do mesmo pacote
// 3) protected -> pode ser acessado estando dentro do mesmo pacote e/ou subclasses
// 4) default -> Caso não tenha sido definido nenhum modificador,
// permitindo o acesso dentro do pacote
public class Conta {

    private int numeroConta;
    private double saldo = 100; // privatizando o valor

    public double retornandosaldo (){ // filtro para pegar o valor e deixar seguro
        return this.saldo;
    }

    public void depositar(double valorDeposito){
        this.saldo = this.saldo + valorDeposito;
    }

    public void saque(double saque){
        this.saldo = this.saldo - saque;
    }

    public Conta(){
        System.out.println("testando1");
    }

    public Conta(int nConta){
        this.numeroConta = nConta;
        System.out.println("meu numero de conta: "+ numeroConta);
    }

}
