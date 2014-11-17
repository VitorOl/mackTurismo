package model;

/**
 * 
 * @author Vitor
 *Classe utilizada para
 *representar o quarto tendo o enum
 *Disponibilidade, aplicando o padr�o state, para 
 *verificar se o status do quarto � dispon�vel ou ocupado 
 *
 */
public class Quarto {
 
	int numero;
	Disponibilidade disponibilidade;
	
	public Quarto(int numero){
		
		this.numero = numero;
		
	}
	public enum Disponibilidade{
		DISPONIVEL("dispon�vel"),
		OCUPADO("ocupado");
		
		String tipo;
		
		
		Disponibilidade(String tipo){
			this.tipo = tipo;
			
		}


		public String getTipo() {
			return tipo;
		}


		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		
		
		
	}
	
}
