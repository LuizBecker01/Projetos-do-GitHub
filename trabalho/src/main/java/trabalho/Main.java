package trabalho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        boolean loop = true;

        while (loop) {

            Scanner teclado = new Scanner(System.in);

            System.out.println();
            System.out.println("*************************************");
            System.out.println("*************More Filmes*************");
            System.out.println("*************************************");
            System.out.println();

            System.out.println();
            System.out.println("Opções do sistema:");
            System.out.println("1 - Inserir Produtos");
            System.out.println("2 - Excluir Produtos");
            System.out.println("3 - Atualizar Produtos");
            System.out.println("4 - Buscar podutos por ID");
            System.out.println("5 - Buscar todos os produtos");
            System.out.println("6 - Inserir funcionario");
            System.out.println("7 - Excluir funcionario");
            System.out.println("8 - Atualizar funcionario");
            System.out.println("9 - Buscar funcionarios por ID");
            System.out.println("10 - Buscar todos os produtos");
            System.out.println("11 - Buscar produtos po nome");
            System.out.println("12 - Buscar produtos por genero");
            System.out.println("13 - Buscar funcionario por nome");
            System.out.println("14 - Buscar funcionario por idade");
            System.out.println("15 - Finalizar o programa");
            System.out.println();

            System.out.println("Informe sua opção:");
            int opcao = teclado.nextInt();

            if (opcao == 1) {
                BancoDados.inserirProdutos();
                Thread.sleep(2000);
            }

            if (opcao == 2) {
                BancoDados.excluirProdutos();
                Thread.sleep(2000);
            }

            if (opcao == 3) {
                BancoDados.atualizarProdutos();
                Thread.sleep(2000);
            }

            if (opcao == 4) {
                BancoDados.buscarPorID();
                Thread.sleep(2000);
            }

            if (opcao == 5) {
                BancoDados.buscarTodos();
                Thread.sleep(2000);
            }

            if (opcao == 6) {
                BancoDados.inserirFuncionarios();
                Thread.sleep(2000);
            }

            if (opcao == 7) {
                BancoDados.excluirFuncionario();
                Thread.sleep(2000);
            }

            if (opcao == 8) {
                BancoDados.atualizarFuncionarios();
                Thread.sleep(2000);
            }

            if (opcao == 9) {
                BancoDados.buscarFuncionarioPorID();
                Thread.sleep(2000);
            }

            if (opcao == 10) {
                BancoDados.buscarTodosFuncionarios();
                Thread.sleep(2000);
            }

            if (opcao == 11) {
                BancoDados.buscarProdutoPorNome();
                Thread.sleep(2000);
            }

            if (opcao == 12) {
                BancoDados.buscarProdutoPorGenero();
                Thread.sleep(2000);
            }

            if (opcao == 13) {
                BancoDados.buscarFuncionarioPorNome();
                Thread.sleep(2000);
            }
            
            if (opcao == 14) {
                BancoDados.buscarFuncionarioPorIdade();
                Thread.sleep(2000);
            }


            if (opcao == 100) {
                loop = false;
            }

        }

    }

}