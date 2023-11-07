package Veiculos.Componentes;

public class Motor {
    
    private String potencia;
    
    public void ronca(){
        System.out.println("Roncando");
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

}
