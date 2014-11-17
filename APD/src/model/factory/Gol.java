package model.factory;
/**
 * @author  Vitor, L�gia e Salom�o
 * Classe respons�vel por representar a companhia aerea Gol no sistema
 *para n�o haver a cria��o de v�rias instancias da companhia aerea,
 *foi o utilizado o padr�o Singleton
 */
public class Gol {

	private static Gol instance;
	
	private Gol(){}
	
	
	public static Gol getInstance(){
		if(instance==null){
			
			instance = new Gol();
		}
		return instance;
	}
	
	
}
