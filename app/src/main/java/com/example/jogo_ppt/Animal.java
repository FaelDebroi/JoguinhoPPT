package com.example.jogo_ppt;

public class Animal {

    String cor ;
    int tamanho;
    double peso;
    String parente;

    public String getParente() {
        return parente;
    }

    public void setParente(String parente) {
        this.parente = parente;
    }

    //Getter e Setter
    //Sempre inserir o valor e sua variavel
    void setCor(String cor){
        //formatacao ou validacao
        this.cor = cor;
    }

    //ele retorna
    String retCor(){
        return this.cor;
    }

    void dormir(){
        System.out.println("O Animal esta dormindo");
    }

    void Tipo(){
        System.out.println("esse animal é um ");
    }

    void acao(){
       System.out.println("o animal esta a ");
    }
}
