package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class BancoDados {

    public static void incerirAluno(){

        String url = "jdbc:mysql://localhost:3306/sisienh?serverTimezone=UTC";
        String usuario = "root";
        String senha = "ienh";



    }

    public static void excluirAlunoPeloId(){

        String url = "jdbc:mysql://localhost:3306/sisienh?serverTimezone=UTC";
        String usuario = "root";
        String senha = "ienh";
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o aluno que deseja excluir");
        int idBusca = teclado.nextInt();
    }
    
    public static void consultaTodosAlunos(){

        String url = "jdbc:mysql://localhost:3306/sisienh?serverTimezone=UTC";
        String usuario = "root";
        String senha = "ienh";

        try{
            // Carrega o driver do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Estabelece conexão com o banco
            Connection conn = DriverManager.getConnection(url, usuario, senha);
            //Cria um objeto Statement (comando) para enviar consultas ao banco
            Statement stmt = conn.createStatement();
            //Executa a consulta SQL
            ResultSet rs = stmt.executeQuery("SELECT * FROM aluno");
            //Itera sobre os resultados e imprime no console
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                double peso = rs.getDouble("peso");
                System.out.println(id + " " + nome + " " + peso); 
            }
        }catch(Exception error){
            System.out.println("Deu ruim!! Fale com o administrador!");
            System.out.println(error);
        }

    }

    public static void consultaTodosAlunosComExcessoDePeso(){

        String url = "jdbc:mysql://localhost:3306/sisienh?serverTimezone=UTC";
        String usuario = "root";
        String senha = "ienh";

        try{
            // Carrega o driver do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Estabelece conexão com o banco
            Connection conn = DriverManager.getConnection(url, usuario, senha);
            //Cria um objeto Statement (comando) para enviar consultas ao banco
            Statement stmt = conn.createStatement();
            //Executa a consulta SQL
            ResultSet rs = stmt.executeQuery("SELECT * FROM aluno WHERE peso > 100");
            //Itera sobre os resultados e imprime no console
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                double peso = rs.getDouble("peso");
                System.out.println(id + " " + nome + " " + peso); 
            }
        }catch(Exception error){
            System.out.println("Deu ruim!! Fale com o administrador!");
            System.out.println(error);
        }

    }

}
