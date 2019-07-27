package Bridge;

public class NavegadorFirefox implements WebSiteImplementado {

	@Override
	public void desenharJanela() {
		System.out.println("Firefox Desenhou janela");

	}

	@Override
	public void conectar() {
		System.out.println("Firefox conectou");
	}

}
