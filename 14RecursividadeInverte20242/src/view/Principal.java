package view;

import controller.InverteFrase;

public class Principal {

	public static void main(String[] args) {
		InverteFrase inv = new InverteFrase();
		String frase = "Nicolle";
		int tamanho = frase.length();
		String resposta = inv.inverteFrase(frase, tamanho);
		System.out.println(resposta);
	}

}
