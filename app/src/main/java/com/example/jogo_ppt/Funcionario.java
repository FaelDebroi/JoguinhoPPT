package com.example.jogo_ppt;

class Funcionario {

    //propriedade
    String nome;
    double salario;
    // funcao



    // digitar a variavel que e responsavel pela valor que vai retornar
    double Recuperarsalario(double bonus, int idade ) {
        this.salario = this.salario - (this.salario * 0.1);
        if(idade>18) {
            return  this.salario + bonus + 10 ;
        }else {
            return  this.salario + bonus ;
        }


//        System.out.println(this.salario);// this- esta nessa class
//        System.out.println(this.nome);

    }
}
