package Model;

import java.io.Serializable;
import java.util.List;



public interface GenericoDAO<E> extends Serializable {
	public List<E> listar();
	public void inserir(E e);
	public void alterar(E e);
	public void remover(E e);
	
	
	
	
	

}
