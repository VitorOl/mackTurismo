package model.factory;

import model.Aviao;

/**
 * 
 * @author Vitor
 * Classe para criação do aviao e definir
 * sua capacidade de assentos de acordo com
 * o modelo do aviao.
 *
 */
public class AviaoFactory implements AviaoAbstractFactory{

	public Aviao newAviao(String tipo) {
		
		if(tipo.equalsIgnoreCase("boing")){
			return new Aviao(580);
		}else if(tipo.equalsIgnoreCase("airbus")){
			return new Aviao(300);
		}
		return null;
	}

}
