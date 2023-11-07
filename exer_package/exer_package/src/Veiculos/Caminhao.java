package Veiculos;

public class Caminhao {
    
    private String marca;
    protected boolean possuiCacamba;

    public void levantaCacamba(){
        System.out.println("Levantando a cacamba");
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPossuiCacamba(boolean possuiCacamba) {
        this.possuiCacamba = possuiCacamba;
    }
}
