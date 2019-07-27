package Main;

import Adapter.AdapterTomada;
import Adapter.Tomada3Pinos;


public class Main {

	public static void main(String[] args) {
		Tomada3Pinos tomada3Pinos = new Tomada3Pinos();
		AdapterTomada adapter = new AdapterTomada(tomada3Pinos);
		adapter.conectarTomada2Pinos();
		
	}

}
