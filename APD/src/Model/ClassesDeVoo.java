package Model;

public class ClassesDeVoo {
	
	/*
	private String classeEconomica;
	private String classeExecutiva;
	private String primeiraClasse;
	*/
	
	private String tipoDeClasse;	
	private double valor=0;
	
	public double calculaClasse() {
		
		if (this.tipoDeClasse == "classeEconomica") {
			this.valor = 170;
		}
		else if (this.tipoDeClasse == "classeExecutiva") {
			this.valor = 130;
		}		
		else {
			valor = 100;
		}		
		return valor;
	}
	
}
