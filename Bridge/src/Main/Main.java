package Main;

public class Main {

	public static void main(String[] args) {
		NavegadorAbstract navegador = new NavegadorChrome(new WebsiteGlobo);
		navegador.exibir();
		
		NavegadorAbstract navegador = new NavegadorFirefox(new WebsiteUol);
		navegador.exibir();
		

	}

}
