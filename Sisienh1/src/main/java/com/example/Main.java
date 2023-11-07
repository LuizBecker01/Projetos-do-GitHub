package com.example;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);

        System.out.println();
        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println("*************Sistema IENH************");
        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println();

        System.out.println();
        System.out.println("Opções do sistema:");
        System.out.println("1 - Exibir todos os alunos");
        System.out.println("2 - Exibir todos os alunos com excesso de peso");
        System.out.println("3: - Escluiraluno pelo id");
        System.out.println("4 - ");
        System.out.println("Qualquer outra tecla - Finalizar o programa");
        System.out.println();

        System.out.println("Informe sua opção:");
        int opcao = teclado.nextInt();

        if(opcao == 1){
            BancoDados.consultaTodosAlunos();
        }

        if(opcao == 2){
            BancoDados.consultaTodosAlunosComExcessoDePeso();   
        }

        System.out.println();
        System.out.println("Bye!!!!");
        System.out.println();

    }

}