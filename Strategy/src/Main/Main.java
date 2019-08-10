package Main;

import Strategy.Vetor;

public class Main {

	public static void main(String[] args) {
		Vetor vetorCrescente = new Vetor(0);
		Vetor vetorDecrescente = new Vetor(1);
		
		System.out.println("Lista em ordem crescente: ");
		vetorCrescente.percorrerVetor();
		System.out.println("");
		System.out.println("Lista em ordem decrescente: ");
		vetorDecrescente.percorrerVetor();

	}

}
