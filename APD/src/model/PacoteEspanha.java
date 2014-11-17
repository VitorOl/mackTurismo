package model;
/**
 * 
 * @author Vitor
 *Classe que representa o pacote de viagem
 *para a Espanha
 */
public class PacoteEspanha extends Pacote {

	
	
	
	
	public enum PontosTuristicos{
		
		BARCELONA("barcelona"),
		ZARAGOZA("zaragoza"),
		MADRID("madrid");
		
		String tipo;
		
		PontosTuristicos(String tipo){
			this.tipo = tipo;
		}
		
	}
}
