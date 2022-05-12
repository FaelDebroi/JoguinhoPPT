package com.example.jogo_ppt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jogo_ppt.classes.Conta;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Conta conta = new Conta(333210);
//        sobracargaDemetodos_pessoas pessoas = new sobracargaDemetodos_pessoas();
//        pessoas.exibirdados("Fael debroi",7);

    }
    ///####aqui ele busca se é pedra
    public void pedra(View view) {
        this.opcaoSelecionada("pedra");
    }

        ///####aqui ele busca se é tisoura
    public void tisoura(View view){
        this.opcaoSelecionada("tisoura");
    }

    ///####aqui ele busca se é papel
    public void papel(View view){
        this.opcaoSelecionada("papel");
    }

    public void opcaoSelecionada(String opcaoUsuario){
        ImageView imageResulta = findViewById(R.id.imageResulta);

        ///#### aqui ele cria um numero que vai sortear a opcao do bot
        int aleatorio = new Random().nextInt(2);
        String[] ppt ={"pedra","tisoura","papel"} ;
        String opcoesApp = ppt[aleatorio];

        switch (opcoesApp){
            case"pedra":
             imageResulta.setImageResource(R.drawable.pedra);
           break;

            case"tisoura":
                imageResulta.setImageResource(R.drawable.tesoura);
                break;

            case"papel":
                imageResulta.setImageResource(R.drawable.papel);
                break;
        }

        TextView texto= findViewById(R.id.testo);


        //App ganhador
        if((opcoesApp.equals("pedra") && opcaoUsuario.equals("tisoura"))||
           (opcoesApp.equals("tisoura") && opcaoUsuario.equals("papel"))||
           (opcoesApp.equals("papel") && opcaoUsuario.equals("pedra"))
        ){
          texto.setText("o bot Venceu");

        //jogador ganhador
        }else if((opcaoUsuario.equals("tisoura") && opcoesApp.equals("papel"))||
                (opcaoUsuario.equals("pedra") && opcoesApp.equals("tisoura"))||
                (opcaoUsuario.equals("papel") && opcoesApp.equals("pedra"))){

            texto.setText("Voce ganhou");

        //empate
        }else{
            texto.setText("Empate");
        }




    }
}

                // Estudando PROGRAMACAO ORIENTADA A OBJETO

//    Estudando class
        /*Casa Minhacasinha = new Casa(); // adicionando a class a uma Variavel
        Minhacasinha.cor = "azul"; // adicionando um valor na class

                System.out.println(Minhacasinha.cor); // puxando a propriedade na class
                Minhacasinha.AbrirPorta(); // puxando o metodo la na class Casa




        Conta conta = new Conta();
        conta.depositar(20);//120
        conta.saque(10);//110

        System.out.println(conta.retornandosaldo());



        Dog dog = new Dog();
        dog.setParente("parente dos lobos"); // seta
        dog.tipo();
        System.out.println("############");

        Passaro pass = new Passaro();
        pass.setParente("parente dos dinoussauros");// seta
        pass.tipo();
        System.out.println("############");




        Passaro birds = new Passaro();
        birds.acao();

        System.out.println("#########");
        birds.setCor("azul"); // buscando um valor
        System.out.println(birds.retCor());
        birds.correr();
        birds.dormir();
        birds.fly();
        System.out.println("#########");
        Dog dogn = new Dog();
        dogn.acao(); // ele sempre vai referenciar a acao da filha se sobre-escrever


        doginho.latir();
        Animal animal = new Animal();
        animal.correr();




//##aprendendo a puxar uma class e parametros
        Funcionario fun = new Funcionario();
        fun.nome= "Debroi";
        fun.salario = 1550;
        // mostra o nome da variavel
        double Salario = fun.Recuperarsalario( 150, 19);
        System.out.println("o salario é de: "+ Salario );
*/