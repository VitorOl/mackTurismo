package dao;

import java.io.Serializable;
import java.util.List;


/**
 * 
 * @author Vitor, Lígia e Salomão
 *Esta interface serve para definir quais serão os metodos base de todos os daos
 * @param <E>
 */
public interface GenericoDAO<E> extends Serializable {
	public List<E> listar();
	public void inserir(E e);
	public void alterar(E e);
	public void remover(E e);
	
	
	
	
	

}
