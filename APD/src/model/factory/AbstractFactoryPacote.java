package model.factory;

import model.Pacote;

/**
 * @author  Vitor, L�gia e Salom�o
 * Implementa��o de uma AbstractFactory para pacotes.
 * Diminuindo o acoplamento e delegando sua cria��o para
 * uma fabrica fora da interface principal do sistema 	
 *
 */
public interface AbstractFactoryPacote {

	public Pacote newPacote(String tipo);
	
}
