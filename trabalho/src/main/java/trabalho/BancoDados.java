package trabalho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

    public class BancoDados {
    
        public static void inserirProdutos(){

            String url = "jdbc:mysql://localhost:3306/morefilmes?serverTimezone=UTC";
            String usuario = "root";
            String senha = "ienh";
            
            Teclado teclado = new Teclado();
            System.out.println("Informe o id do filme da sua escolha: ");
            int idBusca = teclado.leInt();
            System.out.println("Informe o nome do filme da sua escolha: ");
            String nomeF = teclado.leString();
            System.out.println("Informe o genero do filme da sua escolha: ");
            String generoF = teclado.leString();
            System.out.println("Informe a classificacao do filme da sua escolha: ");
            String classF = teclado.leString();
            System.out.println("Informe a sinopse do filme da sua escolha: ");
            String sinF = teclado.leString();

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, usuario, senha);
                Statement stmt = conn.createStatement();
                int linhasAfetadas = stmt.executeUpdate("INSERT INTO `produtos` VALUES  ('" + nomeF + "', '" + generoF + "', '" + classF +"', '"+ sinF +"')");
                if(linhasAfetadas > 0){
                    System.out.println("Filme inserido com sucesso");
                }else {
                    System.out.println("Filme não foi inserido");
                }

                }catch(Exception error){
                    System.out.println("Deu ruim! Fale com o administrador!");
                    System.out.println(error);
            }
    
        }

        public static void excluirProdutos() {

            String url = "jdbc:mysql://localhost:3306/morefilmes?serverTimezone=UTC";
            String usuario = "root";
            String senha = "ienh";

            Teclado teclado = new Teclado();
            System.out.println("Informe o ID do filme que deseja excluir: ");
            int excluirProdutos = teclado.leInt();

             try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, usuario, senha);
                Statement stmt = conn.createStatement();
                int linhasAfetadas = stmt.executeUpdate("DELETE FROM produtos WHERE idprodutos =" + excluirProdutos );
                if(linhasAfetadas > 0){
                    System.out.println("Filme excluido com sucesso");
                }else {
                    System.out.println("Filme não foi excluido");
                }

                }catch(Exception error){
                    System.out.println("Deu ruim! Fale com o administrador!");
                    System.out.println(error);
            }

        }

        public static void atualizarProdutos() {
        
            String url = "jdbc:mysql://localhost:3306/morefilmes?serverTimezone=UTC";
            String usuario = "root";
            String senha = "ienh";

            Teclado teclado = new Teclado();
            System.out.println("Informe o id do filme que deseja atualizar: ");
            int idBusca = teclado.leInt();
            System.out.println("Informe o nome do filme que deseja atulizar: ");
            String nomeA = teclado.leString();
            System.out.println("Informe o genero do filmeque deseja atualizar: ");
            String generoA = teclado.leString();
            System.out.println("Informe a classificacao do filme que deseja atualizar: ");
            String classA = teclado.leString();
            System.out.println("Informe a sinopse do filme que deseja atualizar: ");
            String sinA = teclado.leString();

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, usuario, senha);
                Statement stmt = conn.createStatement();
                int linhasAfetadas = stmt.executeUpdate("UPDATE `morefilmes`.`produtos` SET `nome` = '"+ nomeA +"', `genero` = '"+ generoA +"', `sinopse` = '" + sinA +"' WHERE `idprodutos` =" + idBusca);
                if(linhasAfetadas > 0){
                    System.out.println("Filme atualizado com sucesso");
                }else {
                    System.out.println("Filme não foi atualizado");
                }

                }catch(Exception error){
                    System.out.println("Deu ruim! Fale com o administrador!");
                    System.out.println(error);
            }
 
        }

        public static void buscarPorID() {

            String url = "jdbc:mysql://localhost:3306/morefilmes?serverTimezone=UTC";
            String usuario = "root";
            String senha = "ienh";

            Teclado teclado = new Teclado();
            System.out.println("Informe o ID do filme que deseja buscar: ");
            int idBusca = teclado.leInt();

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, usuario, senha);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM produtos WHERE idprodutos =" + idBusca);
                while(rs.next()){
                    int idprodutos = rs.getInt("idprodutos");
                    String nome = rs.getString("nome");
                    String genero = rs.getString("genero");
                    String classificacao = rs.getString("classificacao");
                    String sinopse = rs.getString("sinopse");
                    System.out.println(idprodutos + " " + nome + " " + genero + " " + classificacao + " " + sinopse);
                }

                }catch(Exception error){
                    System.out.println("Deu ruim! Fale com o administrador!");
                    System.out.println(error);
            }
            
        }

        public static void buscarTodos() {

            String url = "jdbc:mysql://localhost:3306/morefilmes?serverTimezone=UTC";
            String usuario = "root";
            String senha = "ienh";

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, usuario, senha);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM produtos");
                while(rs.next()){
                    int idprodutos = rs.getInt("idprodutos");
                    String nome = rs.getString("nome");
                    String genero = rs.getString("genero");
                    String classificacao = rs.getString("classificacao");
                    String sinopse = rs.getString("sinopse");
                    System.out.println(idprodutos + " " + nome + " " + genero + " " + classificacao + " " + sinopse);
                }

                }catch(Exception error){
                    System.out.println("Deu ruim! Fale com o administrador!");
                    System.out.println(error);
            }
        }

        public static void inserirFuncionarios() {

            String url = "jdbc:mysql://localhost:3306/morefilmes?serverTimezone=UTC";
            String usuario = "root";
            String senha = "ienh";
            
            Teclado teclado = new Teclado();
            System.out.println("Informe o id do funcionario: ");
            int idBuscaf = teclado.leInt();
            System.out.println("Informe o nome do funcionario: ");
            String nome = teclado.leString();
            System.out.println("Informe o CPF do funcionario: ");
            String cpf = teclado.leString();
            System.out.println("Informe a idade do funcionario: ");
            String idade = teclado.leString();
            System.out.println("Informe o salario do funcionario: ");
            String sal = teclado.leString();

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, usuario, senha);
                Statement stmt = conn.createStatement();
                int linhasAfetadas = stmt.executeUpdate("INSERT INTO `funcionarios` ('nome', 'cpf', 'idade', 'sal') VALUES  ('" + nome + "', '" + cpf + "', '" + idade +"', '"+ sal +"')");
                if(linhasAfetadas > 0){
                    System.out.println("Funcionario inserido com sucesso");
                }else {
                    System.out.println("Funcionario não foi inserido");
                }

                }catch(Exception error){
                    System.out.println("Deu ruim! Fale com o administrador!");
                    System.out.println(error);
            }
    
        }

        public static void excluirFuncionario() {
        
            String url = "jdbc:mysql://localhost:3306/morefilmes?serverTimezone=UTC";
            String usuario = "root";
            String senha = "ienh";

            Teclado teclado = new Teclado();
            System.out.println("Informe o ID do funcionario que deseja excluir: ");
            int excluirFuncionarios = teclado.leInt();

             try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, usuario, senha);
                Statement stmt = conn.createStatement();
                int linhasAfetadas = stmt.executeUpdate("DELETE FROM funcionarios WHERE idfuncionario =" + excluirFuncionarios );
                if(linhasAfetadas > 0){
                    System.out.println("Funcionario excluido com sucesso");
                }else {
                    System.out.println("Funcionario não foi excluido");
                }

                }catch(Exception error){
                    System.out.println("Deu ruim! Fale com o administrador!");
                    System.out.println(error);
            }

        }

        public static void atualizarFuncionarios() {

            String url = "jdbc:mysql://localhost:3306/morefilmes?serverTimezone=UTC";
            String usuario = "root";
            String senha = "ienh";

            Teclado teclado = new Teclado();
            System.out.println("Informe o id do funcionario que deseja atualizar: ");
            int idBusca = teclado.leInt();
            System.out.println("Informe o nome do funcionario que deseja atulizar: ");
            String nome = teclado.leString();
            System.out.println("Informe o cpf do funcionario que deseja atualizar: ");
            String cpf = teclado.leString();
            System.out.println("Informe a idade do funcionario que deseja atualizar: ");
            String idade = teclado.leString();
            System.out.println("Informe o salario do funcionario que deseja atualizar: ");
            String salario = teclado.leString();

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, usuario, senha);
                Statement stmt = conn.createStatement();
                int linhasAfetadas = stmt.executeUpdate("UPDATE `funcionarios` SET `nome` = '"+ nome +"' , `cpf` = '"+ cpf +"', `idade` = '"+ idade +"', `salario` = '" + salario +"' WHERE `idfuncionario` =" + idBusca);
                if(linhasAfetadas > 0){
                    System.out.println("Funcionario atualizado com sucesso");
                }else {
                    System.out.println("Fundionario não foi atualizado");
                }

                }catch(Exception error){
                    System.out.println("Deu ruim! Fale com o administrador!");
                    System.out.println(error);
            }

        }

        public static void buscarFuncionarioPorID() {

            String url = "jdbc:mysql://localhost:3306/morefilmes?serverTimezone=UTC";
            String usuario = "root";
            String senha = "ienh";

            Teclado teclado = new Teclado();
            System.out.println("Informe o ID do funcionario que deseja buscar: ");
            int idBusca = teclado.leInt();

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, usuario, senha);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM funcionarios WHERE idfuncionario =" + idBusca);
                while(rs.next()){
                    int idfuncionario = rs.getInt("idfuncionario");
                    String nome = rs.getString("nome");
                    String cpf = rs.getString("cpf");
                    String idade = rs.getString("idade");
                    String salario = rs.getString("salario");
                    System.out.println(idfuncionario + " " + nome + " " + cpf + " " + idade + " " + salario);
                }

                }catch(Exception error){
                    System.out.println("Deu ruim! Fale com o administrador!");
                    System.out.println(error);
            }

        }

        public static void buscarTodosFuncionarios() {

            String url = "jdbc:mysql://localhost:3306/morefilmes?serverTimezone=UTC";
            String usuario = "root";
            String senha = "ienh";

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, usuario, senha);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM funcionarios");
                while(rs.next()){
                    int idfuncionario = rs.getInt("idfuncionario");
                    String nome = rs.getString("nome");
                    String cpf = rs.getString("cpf");
                    String idade = rs.getString("idade");
                    String salario = rs.getString("salario");
                    System.out.println(idfuncionario + " " + nome + " " + cpf + " " + idade + " " + salario);
                }

                }catch(Exception error){
                    System.out.println("Deu ruim! Fale com o administrador!");
                    System.out.println(error);
            }

        }

        public static void buscarProdutoPorNome() {

            String url = "jdbc:mysql://localhost:3306/morefilmes?serverTimezone=UTC";
            String usuario = "root";
            String senha = "ienh";

            Teclado teclado = new Teclado();
            System.out.println("Informe o Nome do filme que deseja buscar: ");
            int nomeBusca = teclado.leInt();

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, usuario, senha);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM produtos WHERE nome =" + nomeBusca);
                while(rs.next()){
                    int idprodutos = rs.getInt("idprodutos");
                    String nome = rs.getString("nome");
                    String genero = rs.getString("genero");
                    String calssificacao = rs.getString("classificacao");
                    String sinopse = rs.getString("sinopse");
                    System.out.println(idprodutos + " " + nomeBusca + " " + genero + " " + calssificacao + " " + sinopse);
                }

                }catch(Exception error){
                    System.out.println("Deu ruim! Fale com o administrador!");
                    System.out.println(error);
            }

        }

        public static void buscarProdutoPorGenero() {

            String url = "jdbc:mysql://localhost:3306/morefilmes?serverTimezone=UTC";
            String usuario = "root";
            String senha = "ienh";

            Teclado teclado = new Teclado();
            System.out.println("Informe o genero do filme que deseja buscar: ");
            int generoBusca = teclado.leInt();

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, usuario, senha);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM produtos WHERE genero =" + generoBusca);
                while(rs.next()){
                    int idprodutos = rs.getInt("idprodutos");
                    String nome = rs.getString("nome");
                    String genero = rs.getString("genero");
                    String calssificacao = rs.getString("classificacao");
                    String sinopse = rs.getString("sinopse");
                    System.out.println(idprodutos + " " + nome + " " + generoBusca + " " + calssificacao + " " + sinopse);
                }

                }catch(Exception error){
                    System.out.println("Deu ruim! Fale com o administrador!");
                    System.out.println(error);

            }
        }

        public static void buscarFuncionarioPorNome() {

            String url = "jdbc:mysql://localhost:3306/morefilmes?serverTimezone=UTC";
            String usuario = "root";
            String senha = "ienh";

            Teclado teclado = new Teclado();
            System.out.println("Informe o nome do funcionario que deseja buscar: ");
            int nomeBusca = teclado.leInt();

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, usuario, senha);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM funcionarios WHERE nome =" + nomeBusca);
                while(rs.next()){
                    int idfuncionario = rs.getInt("idfuncionario");
                    String nome = rs.getString("nome");
                    String cpf = rs.getString("cpf");
                    String idade = rs.getString("idade");
                    String salario = rs.getString("salario");
                    System.out.println(idfuncionario + " " + nomeBusca + " " + cpf + " " + idade + " " + salario);
                }

                }catch(Exception error){
                    System.out.println("Deu ruim! Fale com o administrador!");
                    System.out.println(error);

            }

        }

        public static void buscarFuncionarioPorIdade() {

             String url = "jdbc:mysql://localhost:3306/morefilmes?serverTimezone=UTC";
            String usuario = "root";
            String senha = "ienh";

            Teclado teclado = new Teclado();
            System.out.println("Informe o nome do funcionario que deseja buscar: ");
            int idadeBusca = teclado.leInt();

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(url, usuario, senha);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM funcionarios WHERE idade =" + idadeBusca);
                while(rs.next()){
                    int idfuncionario = rs.getInt("idfuncionario");
                    String nome = rs.getString("nome");
                    String cpf = rs.getString("cpf");
                    String idade = rs.getString("idade");
                    String salario = rs.getString("salario");
                    System.out.println(idfuncionario + " " + nome + " " + cpf + " " + idadeBusca + " " + salario);
                }

                }catch(Exception error){
                    System.out.println("Deu ruim! Fale com o administrador!");
                    System.out.println(error);

            }

        }

}

