package Main;

import Bridge.INavegador;
import Bridge.NavegadorChrome;
import Bridge.NavegadorFirefox;
import Bridge.WebsiteGlobo;
import Bridge.WebsiteUol;

public class Main {

	public static void main(String[] args) {
		INavegador navegador = new NavegadorChrome(new WebsiteGlobo());
		navegador.exibir();
		
		INavegador navegador2 = new NavegadorFirefox(new WebsiteUol());
		navegador2.exibir();
		

	}

}
