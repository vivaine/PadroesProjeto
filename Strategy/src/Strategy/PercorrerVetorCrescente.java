package Strategy;

import java.util.ArrayList;

public class PercorrerVetorCrescente implements PercorreVetor {
	
	public void PercorrerVetor(ArrayList<String> lista) {
		for (String item : lista) {
			System.out.println(item);
		}
	}

}
