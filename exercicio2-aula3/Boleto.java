public class Boleto implements MetodoDePagamento{

    private String codigodeBarras;
    private String valor;

    public void realizarPagamento(double valor) {
       System.out.println("Pagando o valor de " + valor);
    }
    
}
