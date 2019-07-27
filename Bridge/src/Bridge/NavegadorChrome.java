package Bridge;

public class NavegadorChrome implements WebSiteImplementado {

	@Override
	public void desenharJanela() {
		System.out.println("Chrome Desenhou janela");

	}

	@Override
	public void conectar() {
		System.out.println("Chrome conectou");
		
	}

}
