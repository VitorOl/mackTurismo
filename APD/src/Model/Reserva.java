package Model;

public class Reserva {
	
	private Voo voo;
	private Passageiro passageiro;
	
	// Em outra classe (provavelmente no metodo main) ser� instanciado um voo a add em Reserva.
	public Reserva(Voo voo) {
		this.voo = voo;
	}

}
