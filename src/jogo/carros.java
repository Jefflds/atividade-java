package jogo;

public class carros {

	private int id;
	private String marca;
	private String modelo;
	private float velocidade;
	private float controle;
	private float aceleração;
	private float arrancada;
	private float frenagem;
	private int preço;
	private String cor;

	public carros(int id, String marca, String modelo, float velocidade, float controle, float aceleração,
			float arrancada, float frenagem, int preço, String cor) {

		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.controle = controle;
		this.aceleração = aceleração;
		this.arrancada = arrancada;
		this.frenagem = frenagem;
		this.preço = preço;
		this.cor = cor;

	};

	public String vercarros() {

		return id + "- \n Marca: " + marca + "\nModelo: " + modelo + "\nVelocidade: " + velocidade + "F"
				+ "\nControle: " + controle + "\nAceleração: " + aceleração + "\nArrancada: " + arrancada
				+ "\nFrenagem: " + frenagem + "\nPreço: R$" + preço + "\nCor: " + cor;

	}

	public String vercarrosimples() {

		return marca + "  " + modelo;

	}

	public String buzinar() {

		return "biiiiiiii";

	}

	public String bater() {

		return "BOOOOOOOMMMM";

	}

}