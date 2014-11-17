package model.factory;
/**
 * @author  Vitor, Lígia e Salomão
 * Classe responsável por representar a companhia aerea Gol no sistema
 *para não haver a criação de várias instancias da companhia aerea,
 *foi o utilizado o padrão Singleton
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
