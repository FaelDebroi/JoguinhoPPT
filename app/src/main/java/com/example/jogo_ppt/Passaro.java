package com.example.jogo_ppt;

//esse extends ele estende a classe filha com a pai
// a primeira class e estendia a segunda
//tua que a class pai tem a filha tmb tem
public class Passaro extends Animal {
    void fly(){
        System.out.println("the birds will fly");
    }

    void acao (){
        super.acao();
        System.out.println("Voar");
    }

    void tipo(){
        super.Tipo();
        System.out.println("passaro"+ this.getParente());
    }
}
