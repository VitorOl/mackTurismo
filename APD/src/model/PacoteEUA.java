package model;


/**
 * 
 * @author Vitor
 *Classe que representa o pacote de viagem
 *para o EUA
 */
public class PacoteEUA extends Pacote {

	
	
	
	
	public enum PontosTuristicos{
		
		CALIFORNIA("california"),
		TEXAS("texas"),
		NOVA_YORK("ny");
		
		String tipo;
		
		PontosTuristicos(String tipo){
			this.tipo = tipo;
		}
		
	}
	
	
}
