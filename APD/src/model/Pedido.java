package model;

import model.factory.AbstractFactoryPacote;


public class Pedido {

	Passageiro passageiro;
	Quarto quarto;
	Assento assento;
	AbstractFactoryPacote pacote;
	Hotel hotel;
	
	
	public Pedido(Passageiro passageiro, Quarto quarto, Assento assento, AbstractFactoryPacote pacote, Hotel hotel){
		super();
		this.passageiro = passageiro;
		this.quarto = quarto;
		this.assento = assento;
		this.pacote = pacote;
		this.hotel = hotel;
		
		
		
	}
	
}
