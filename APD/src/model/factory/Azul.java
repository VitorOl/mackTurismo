package model.factory;

/**
 * @author  Vitor, L�gia e Salom�o
 * Classe respons�vel por representar a companhia aerea Azul no sistema
 *para n�o haver a cria��o de v�rias instancias da companhia aerea,
 *foi o utilizado o padr�o Singleton
 */
public class Azul {

	
	private static Azul instance;
	
	
	private Azul(){}
	
	public static Azul getInstance(){
		if(instance==null){
			instance = new Azul();
			
		}
		return instance;
	}
	
	
}
