package dao;

import java.io.Serializable;
import java.util.List;


/**
 * 
 * @author Vitor, L�gia e Salom�o
 *Esta interface serve para definir quais ser�o os metodos base de todos os daos
 * @param <E>
 */
public interface GenericoDAO<E> extends Serializable {
	public List<E> listar();
	public void inserir(E e);
	public void alterar(E e);
	public void remover(E e);
	
	
	
	
	

}
