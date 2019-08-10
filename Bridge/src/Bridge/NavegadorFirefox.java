package Bridge;

public class NavegadorFirefox extends NavegadorAbstract implements INavegador {

	public NavegadorFirefox(Website website) {
		super(website);
	}
	
	
	@Override
	public void desenharJanela() {
		System.out.println("Firefox Desenhou janela");

	}

	@Override
	public void conectar() {
		System.out.println("Firefox conectou");
	}

	@Override
	public void exibir() {
		// TODO Auto-generated method stub
		
	}

}
