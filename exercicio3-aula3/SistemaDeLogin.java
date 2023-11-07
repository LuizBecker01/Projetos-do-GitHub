package exercicio3;
import java.util.Scanner;

public class SistemaDeLogin {
    public void realizarLogin(Autenticador autenticador) {
        if (autenticador.autenticar()) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Falha na autenticação!");
        }
    }

    public static void main(String[] args) {
        SistemaDeLogin sistemaLogin = new SistemaDeLogin();
        Autenticador autenticadorSenha = new AutenticacaoSenha();
        sistemaLogin.realizarLogin(autenticadorSenha);

        Autenticador autenticadorBiometrico = new AutenticacaoBiometrica();
        sistemaLogin.realizarLogin(autenticadorBiometrico);

        Autenticador autenticadorDoisFatores = new AutenticacaoDoisFatores();
        sistemaLogin.realizarLogin(autenticadorDoisFatores);
    }
}

