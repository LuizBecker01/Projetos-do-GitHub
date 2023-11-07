package exercicio4;
public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new CalculadoraAvancada();

        System.out.println("Adição: " + calculadora.adicao(5, 3));
        System.out.println("Subtração: " + calculadora.subtracao(10, 4));
        System.out.println("Multiplicação: " + calculadora.multiplicacao(6, 8));
        System.out.println("Divisão: " + calculadora.divisao(15, 3));
        System.out.println("Potenciação: " + calculadora.potenciacao(2, 3));

        // Teste de métodos extras
        System.out.println("Raiz Quadrada: " + calculadora.raizQuadrada(25));
        System.out.println("Logaritmo: " + calculadora.logaritmo(100, 10));
    }
}
