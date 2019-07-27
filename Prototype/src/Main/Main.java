package Main;

import Prototype.DocPrototype;
import Prototype.DocumentoPrototype;

public class Main {

	public static void main(String[] args) {
		DocPrototype prototipoDoc = new DocPrototype();
		
		DocumentoPrototype docGrande = prototipoDoc.clonar();
		docGrande.setTamanhoPagina("A4");
		
		DocumentoPrototype docEnorme = prototipoDoc.clonar();
		docEnorme.setTamanhoPagina("A3");
		
		System.out.println(docGrande.exibirInfo());
		System.out.println(docEnorme.exibirInfo());
		
		
	}

}
