package FlyWeight;

import java.util.ArrayList;


public class ArquivoFactory {
	
	protected ArrayList<Arquivo> listaArquivos;
	
	public ArquivoFactory() {
		listaArquivos = new ArrayList<Arquivo>();
		listaArquivos.add(new Arquivo("Arquivo 1", "Servidor China"));
		listaArquivos.add(new Arquivo("Arquivo 2", "Servidor Grécia"));
		
	}
	
	public String localizarArquivo(String nomeArquivo) {
		for (Arquivo arquivoTmp : listaArquivos) {
			if (arquivoTmp.getNome() == nomeArquivo) {
				return arquivoTmp.getLocalizacao();
			}
		}
        return "Arquivo não existe";
	}

}
