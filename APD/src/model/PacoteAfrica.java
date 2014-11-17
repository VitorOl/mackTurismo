package model;
/**
 * 
 * @author Vitor
 *Classe que representa o pacote de viagem
 *para a Africa
 */
public class PacoteAfrica extends Pacote {


	
	
	
	public enum PontosTuristicos{
		
		AFRICA_DO_SUL("pretoria"),
		EGITO("cairo"),
		ANGOLA("luanda");
		
		String tipo;
		
		PontosTuristicos(String tipo){
			this.tipo = tipo;
		}
		
	}
	
	
}
