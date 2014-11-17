package model.factory;

/**
 * @author  Vitor, Lígia e Salomão
 * Classe responsável por representar a companhia aerea Azul no sistema
 *para não haver a criação de várias instancias da companhia aerea,
 *foi o utilizado o padrão Singleton
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
