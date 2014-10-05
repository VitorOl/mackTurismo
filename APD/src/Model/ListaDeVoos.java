package Model;

import java.util.ArrayList;
import java.util.List;

public class ListaDeVoos {
	
	private List<String> listaDeVoos = new ArrayList<String>();
	double valor=0;
	
	public ListaDeVoos() {
		for (int i=0; i<this.listaDeVoos.size(); i++) {
			this.listaDeVoos.add("Sao Paulo - Rio de Janeiro");
			this.listaDeVoos.add("Sao Paulo - Salvador");
			this.listaDeVoos.add("Sao Paulo - Brasilia");
			this.listaDeVoos.add("Rio de Janeiro - Salvador");
			this.listaDeVoos.add("Porto Alegre - Belo Horizonte");
		}
	}
	
	public double calculaOpcaoVoo() {
		
		if (this.listaDeVoos.contains("Sao Paulo")) {
			this.valor += 200;
		}
		else if (this.listaDeVoos.contains("Rio de Janeiro")) {
			this.valor += 200;
		}
		else if (this.listaDeVoos.contains("Salvador")) {
			valor += 150;
		}
		else if(this.listaDeVoos.contains("Brasilia")) {
			valor += 140;
		}
		else {
			valor = 100;
		}

		return valor;		
	}
	
}
