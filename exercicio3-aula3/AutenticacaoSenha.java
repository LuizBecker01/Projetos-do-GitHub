package exercicio3;
import java.util.Scanner;

public class AutenticacaoSenha implements Autenticador {
    
    public boolean autenticar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome de usuário: ");
        String username = scanner.nextLine();
        System.out.print("Digite sua senha: ");
        String password = scanner.nextLine();
        
        return true;
    }
}

