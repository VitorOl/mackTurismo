package model;

/**
 * @author  Vitor, Lígia e Salomão
 * Classe responsável por representar as passagens vendidas no sistema
 *implementa o padrão state
 */
public class Passagem {

	private double preco;
	private String tipoPassagem;
	private Voo voo;
	
	public enum TipoPassagem{
		
		IDA("ida"),
		VOLTA("volta"),
		IDA_E_VOLTA("ambas");
		
		String tipo;
		
		TipoPassagem(String tipo){
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
