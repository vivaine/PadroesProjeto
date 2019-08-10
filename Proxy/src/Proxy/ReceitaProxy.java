package Proxy;

public class ReceitaProxy {
	
	private ReceitaFederal receita;
	
	public ReceitaProxy() {
		receita = new ReceitaFederal();
	}
	
	public String pagarFisico(float valorDocumento, float valorImposto, String cpf) {
		return receita.pagarFisico(valorDocumento, valorImposto, cpf);
	}

	public String pagarJuridico(float valorDocumento, float valorImposto, String cnpj) {
		return receita.pagarJuridico(valorDocumento, valorImposto, cnpj);	
		
	}	
	
}
