package jogo;

public class carros_especiais extends carros {

	public carros_especiais(int id, String marca, String modelo, float velocidade, float controle, float aceleração,
			float arrancada, float frenagem, int preço, String cor) {
		super(id, marca, modelo, velocidade, controle, aceleração, arrancada, frenagem, preço, cor);

	}

	public String buzinar() {
		return "BRRRROOOMMMM!";
	}

	public String bater() {
		return "CRASHHHHHHHH!";
	}

}
