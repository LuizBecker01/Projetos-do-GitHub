package exercicio4;

public class CalculadoraAvancada implements Calculadora {
 
    public double adicao(double a, double b) {
        return a + b;
    }
   
    public double subtracao(double a, double b) {
        return a - b;
    }
   
    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double divisao(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
    }

    public double potenciacao(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public double raizQuadrada(double numero) {
        return Math.sqrt(numero);
    }

    public double logaritmo(double numero, double base) {
        return Math.log(numero) / Math.log(base);
    }
}

