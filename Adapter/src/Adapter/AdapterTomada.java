package Adapter;

public class AdapterTomada extends Tomada2Pinos {
	
	private Tomada3Pinos tomada3Pinos;
	
	public AdapterTomada(Tomada3Pinos tomada3Pinos) {
		this.tomada3Pinos = tomada3Pinos;
	}
	
	public void conectarTomada2Pinos() {
		tomada3Pinos.conectarTomada3Pinos();
	}

}
