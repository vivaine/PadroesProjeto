package Strategy;

import java.util.ArrayList;
import Strategy.PercorrerVetorCrescente;
import Strategy.PercorrerVetorDecrescente;

public class Vetor {
	
	public ArrayList<String> vetor;
	public PercorreVetor percorreVetor;
	
	public Vetor(int tipo) {
		vetor = new ArrayList<String>();
		vetor.add("Ana");
		vetor.add("Bruno");
		vetor.add("Carlos");
		vetor.add("Diógenes");
		
		if (tipo == 0 ) {
			percorreVetor = new PercorrerVetorCrescente();
		}
		else {
			percorreVetor = new PercorrerVetorDecrescente();
		}
		
	}
	
	public void percorrerVetor() {
		percorreVetor.PercorrerVetor(vetor);
	}
	
	

}
