public class CarrinhoDeCompras {
    
    public void finalizarCompras(MetodoDePagamento metodo, double valor){
        metodo.realizarPagamento(valor);
    }

}
