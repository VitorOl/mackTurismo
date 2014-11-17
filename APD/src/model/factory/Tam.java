package model.factory;
/**
 * @author  Vitor, L�gia e Salom�o
 * Classe respons�vel por representar a companhia aerea Tam no sistema
 *para n�o haver a cria��o de v�rias instancias da companhia aerea,
 *foi o utilizado o padr�o Singleton
 */
public class Tam {

	
	private static Tam instance;
	
	
	private Tam(){
		
	}
	public static Tam getInstance(){
		if(instance==null){
			instance = new Tam();
			
		}
		return instance;
		
	}
	
}
