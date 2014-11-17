package model;

/**
 * @author  Vitor, Lígia e Salomão
 * Classe responsável por representar a reserva feita pelo passageiro
 *
 */
public class Reserva {
	private Long eTicket;
	Hotel hotel;
	
	//Reserva da passagem de avião, ou do hotel?
	private Voo voo;
	private Passageiro passageiro;
	
	
	public Reserva(Voo voo, Passageiro passageiro, Long ticket) {
		this.voo = voo;
		this.passageiro = passageiro;
		this.eTicket = ticket;
	}


	public Long geteTicket() {
		return eTicket;
	}


	public void seteTicket(Long eTicket) {
		this.eTicket = eTicket;
	}


	public Hotel getHotel() {
		return hotel;
	}


	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}


	public Voo getVoo() {
		return voo;
	}


	public void setVoo(Voo voo) {
		this.voo = voo;
	}


	public Passageiro getPassageiro() {
		return passageiro;
	}


	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
	
	
	

}
