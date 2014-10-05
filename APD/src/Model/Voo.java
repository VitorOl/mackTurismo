package Model;

public class Voo {
	
	private DatasDeVoos data;
	private ClassesDeVoo classeDeVoo;
	private ListaDeVoos vooDesejado;	
	private double valorTotal;
	
	public Voo (DatasDeVoos data, ClassesDeVoo classeDeVoo, ListaDeVoos vooDesejado) {
		this.data = data;
		this.classeDeVoo = classeDeVoo;
		this.vooDesejado = vooDesejado;
	}
	
	public void calculaVoo() {
		
		this.valorTotal = data.calculaData() + classeDeVoo.calculaClasse() + vooDesejado.calculaOpcaoVoo();
	}
	
}
