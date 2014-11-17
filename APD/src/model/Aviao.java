package model;


/**
 * 
 * @author  Vitor, Lígia e Salomão
 * Classe responsável por representar os aviões no sistema
 *
 */
public class Aviao {

	Long id;
	Assento[] assentos;
	Voo[] voos;
	String tipo;
	int numeroVoo=0;
	
	public Aviao(int numeroDeAssentos){
		super();
		
		assentos = new Assento[numeroDeAssentos];
		
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Assento[] getAssentos() {
		return assentos;
	}

	public void setAssentos(Assento[] assentos) {
		this.assentos = assentos;
	}

	public Voo[] getVoos() {
		return voos;
	}

	public void setVoos(Voo[] voos) {
		this.voos = voos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumeroVoo() {
		return numeroVoo;
	}

	public void setNumeroVoo(int numeroVoo) {
		this.numeroVoo = numeroVoo;
	}
	
	


	
	
}
