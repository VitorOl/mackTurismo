package model.factory;

import model.Pacote;
import model.PacoteAfrica;
import model.PacoteEUA;
import model.PacoteEspanha;


/**
 * 
 * @author Vitor
 *Esta classe serve para 
 *criar pacotes especificos, sem 
 *precisar fazer isso dentro da interface
 *e utilizando o padrão AbstractFactory
 */
public class FactoryPacote implements AbstractFactoryPacote{

	
	
	public  Pacote newPacote(String tipo) {
		
		if(tipo.equalsIgnoreCase("eua")){
			return new PacoteEUA();
		}else if(tipo.equalsIgnoreCase("espanha")){
			return new PacoteEspanha();
		}else if(tipo.equalsIgnoreCase("africa")){
			return new PacoteAfrica();
		}
		
		return null;
	}

}
