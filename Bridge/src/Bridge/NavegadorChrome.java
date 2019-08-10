package Bridge;

public class NavegadorChrome extends NavegadorAbstract implements INavegador {

	
	public NavegadorChrome(Website website) {
		super(website);
	}
	
	@Override
	public void desenharJanela() {
		System.out.println("Chrome Desenhou janela");

	}

	@Override
	public void conectar() {
		System.out.println("Chrome conectou");
		
	}
	
	
	public void exibir() {
		
	}

}
