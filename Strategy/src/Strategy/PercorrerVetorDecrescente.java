package Strategy;

import java.util.ArrayList;
import java.util.Collections;

public class PercorrerVetorDecrescente implements PercorreVetor {

	@Override
	public void PercorrerVetor(ArrayList<String> lista) {
		Collections.reverse(lista);
		for (String item : lista) {
			System.out.println(item);
		}	

	}

}
