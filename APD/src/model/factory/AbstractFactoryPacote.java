package model.factory;

import model.Pacote;

/**
 * @author  Vitor, Lígia e Salomão
 * Implementação de uma AbstractFactory para pacotes.
 * Diminuindo o acoplamento e delegando sua criação para
 * uma fabrica fora da interface principal do sistema 	
 *
 */
public interface AbstractFactoryPacote {

	public Pacote newPacote(String tipo);
	
}
