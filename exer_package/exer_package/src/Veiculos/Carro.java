package Veiculos;

public class Carro{
    
    private String marca;
    private int cavalos;
    protected String modelo;

    public void liga(){
        System.out.println("Liga" + marca);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }
}