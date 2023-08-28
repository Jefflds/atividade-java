package jogo;

import java.util.ArrayList;

import java.util.Scanner;

public class app_jogo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<carros> Listacarros = new ArrayList<>();
		Garagem<carros> garagem = new Garagem<>();

		carros c1 = new carros(1, "Ferrari", "LaFerrari", 8.3f, 8.8f, 9.6f, 9.3f, 10f, 800000, "vermelho");

		carros c2 = new carros(2, "McLaren", "P1", 9.4f, 8.7f, 9.5f, 9.1f, 10f, 780000, "Laranja");

		carros c3 = new carros(3, "Hennessey", "Venom GT", 10f, 8.3f, 9.4f, 9.1f, 10f, 380000, "Amarelo");

		carros c4 = new carros(4, "Bugatti", "Veyron Super Sport", 10f, 8.2f, 10f, 10f, 9.9f, 1080000,
				"Preto e Laranja");

		carros c5 = new carros(5, "Porsche", "918 Spyder", 8.4f, 8.3f, 9.7f, 10f, 10, 850000, "Prata");

		carros c6 = new carros_especiais(6, "tesla", "foguete car", 10f, 8.0f, 10f, 10f, 9.0f, 3000000, "Cinza");

		carros c7 = new carros_especiais(7, "google", "AIcar", 9.8f, 10f, 9.0f, 10f, 10f, 5000000, "Vermelho");

		Listacarros.add(c1);
		Listacarros.add(c2);
		Listacarros.add(c3);
		Listacarros.add(c4);
		Listacarros.add(c5);
		Listacarros.add(c6);
		Listacarros.add(c7);


System.out.println(c7.bater() + "\n");



		System.out.println("você tem 800000 reais, Escolha um carro para adicionar a sua garagem");

		for (carros carro : Listacarros) {

			System.out.println(carro.vercarros() + "\n");

		}

		int escolha = scanner.nextInt();

		if (escolha == 1) {
			garagem.adicionarCarro(c1);
			System.out.println("Você comprou um " + c1.vercarrosimples());
		} else if (escolha == 2) {
			garagem.adicionarCarro(c2);
			System.out.println("Você comprou um " + c2.vercarrosimples());
		} else if (escolha == 3) {
			garagem.adicionarCarro(c3);
			System.out.println("Você comprou um " + c3.vercarrosimples());
		} else if (escolha == 4) {
			garagem.adicionarCarro(c4);
			System.out.println("Você comprou um " + c4.vercarrosimples());
		} else if (escolha == 5) {
			garagem.adicionarCarro(c5);
			System.out.println("Você comprou um " + c5.vercarrosimples());
		} else if (escolha == 6) {
			garagem.adicionarCarro(c6);
			System.out.println("Você comprou um " + c6.vercarrosimples());
		} else if (escolha == 7) {
			garagem.adicionarCarro(c7);
			System.out.println("Você comprou um " + c7.vercarrosimples());
		}

		System.out.println("\nLista de carros na garagem:");
		garagem.listarCarros();

	}

}
