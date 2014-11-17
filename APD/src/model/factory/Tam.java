package model.factory;
/**
 * @author  Vitor, Lígia e Salomão
 * Classe responsável por representar a companhia aerea Tam no sistema
 *para não haver a criação de várias instancias da companhia aerea,
 *foi o utilizado o padrão Singleton
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
