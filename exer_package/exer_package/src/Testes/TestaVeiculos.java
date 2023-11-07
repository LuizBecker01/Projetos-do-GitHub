package Testes;

import Veiculos.Carro;
import Veiculos.Caminhao;
import Veiculos.Moto;

public class TestaVeiculos {
    
    public static void main(String[] args) {
        
        Caminhao veiculo1 = new Caminhao();
        Carro veiculo2 = new Carro();
        Moto veiculo3 = new Moto();

        veiculo1.setMarca("Scania");
        veiculo1.setPossuiCacamba(true);

        veiculo2.setMarca("Porsche");
        veiculo2.setCavalos(800);

        veiculo3.setMarca("BMW");
        veiculo3.setPartidaAutomatica(true);

    }

}
