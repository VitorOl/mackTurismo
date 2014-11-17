package model.factory;

import model.Aviao;

/**
 * 
 * @author Vitor
 * A classe AviaoAbstractFactory foi criada
 * para ser a interface na implementação
 * do padrao abstractFactory
 *
 */
public interface AviaoAbstractFactory {

	public Aviao newAviao(String tipo);
}
