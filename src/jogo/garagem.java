package jogo;

import java.util.ArrayList;

class Garagem<T extends carros> {
	
    private ArrayList<T> carrosNaGaragem = new ArrayList<>();

    public void adicionarCarro(T carro) {
        carrosNaGaragem.add(carro);
    }

    public void listarCarros() {
        for (T carro : carrosNaGaragem) {
            System.out.println(carro.vercarros());
        }
    }
    
    
    
}