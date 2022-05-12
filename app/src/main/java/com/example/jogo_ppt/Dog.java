package com.example.jogo_ppt;

public class Dog extends Animal {
    void latir(){

        System.out.println("Dog will talk");
    }

    void acao(){
        super.acao();// o super referencia a classe pai e puxa a funcao que deseja
        System.out.println("correr");
    }

    void tipo(){
        super.Tipo();
        System.out.println("Carnivoro e " +this.getParente());
    }
}
