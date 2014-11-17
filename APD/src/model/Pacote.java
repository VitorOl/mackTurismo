package model;

/**
 * @author  Vitor, L�gia e Salom�o
 * Classe abstract, respons�vel por ser a base 
 * de cria��o de pacotes espec�ficos e auxiliar na implementa��o do padr�o abstractFactory
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
