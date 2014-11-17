package model;

/**
 * @author  Vitor, Lígia e Salomão
 * Classe abstract, responsável por ser a base 
 * de criação de pacotes específicos e auxiliar na implementação do padrão abstractFactory
 *
 */
public abstract class Pacote {

	protected Passagem passagem;
	protected Hotel hotel;
	protected String pontosTuristicos;
	
	
	public Passagem getPassagem() {
		return passagem;
	}
	public void setPassagem(Passagem passagem) {
		this.passagem = passagem;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public String getPontosTuristicos() {
		return pontosTuristicos;
	}
	public void setPontosTuristicos(String pontosTuristicos) {
		this.pontosTuristicos = pontosTuristicos;
	}
	
	
	
	
}
