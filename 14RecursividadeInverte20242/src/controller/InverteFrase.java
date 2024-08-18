package controller;

public class InverteFrase {

	public InverteFrase() {
		super();
	}
	public String inverteFrase(String f, int tamanho) {
		//Comando de parada
		if(tamanho == 0) {
			return "";	
		} else {
			return f.substring((tamanho-1),tamanho)+ inverteFrase(f, tamanho-1); //Chamada de função
		}
	}
	

}
