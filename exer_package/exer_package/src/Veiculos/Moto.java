package Veiculos;

public class Moto{
    
    private String marca;
    protected boolean partidaAutomatica;

    public void partida(){
        System.out.println("Sair andando");
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPartidaAutomatica(boolean partidaAutomatica) {
        this.partidaAutomatica = partidaAutomatica;
    }
}
