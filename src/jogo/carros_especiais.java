package jogo;

public class carros_especiais extends carros {

	public carros_especiais(int id, String marca, String modelo, float velocidade, float controle, float aceleração,float arrancada, float frenagem, int preço, String cor) {
		super(id, marca, modelo, velocidade, controle, aceleração, arrancada, frenagem, preço, cor);
	 
	}

	  
	    public void buzinar() {
	        System.out.println(" BRRRROOOMMMM!");
	    }

	    
	    public void bater() {
	        System.out.println("CRASHHHHHHHH!");
	    }
	
	
	
}
