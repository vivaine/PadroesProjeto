package Proxy;

public class ReceitaFederal {
	
	public String pagarFisico(float valorDocumento, float valorImposto, String cpf) {
		return "Pagou o imposto de pessoa física";
		
	}

	public String pagarJuridico(float valorDocumento, float valorImposto, String cnpj) {
		return "Pagou o imposto de pessoa jurídica";
	}	
		

}
