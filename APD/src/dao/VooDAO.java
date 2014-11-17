package dao;

import java.util.List;

import model.Voo;
/**
 * 
  * @author  Vitor, L�gia e Salom�o
 * Classe respons�vel por fazer as opera��es relacionadas aos voos
 * no banco de dados
 *
 */
public class VooDAO implements GenericoDAO<Voo> {
	List<Voo>voos;

	
	public List<Voo> listar() {
		return voos;
	}

	
	public void inserir(Voo v) {
		voos.add(v);
		
	}

	
	public void alterar(Voo v) {
		
		for(int i=0;i<voos.size();i++){
			if(voos.get(i).equals(v)){
				voos.add(i, v);
			}
			}
	}

	
	public void remover(Voo v) {
		for(int i=0;i<voos.size();i++){
			if(voos.get(i).equals(v)){
				voos.remove(i);
			}	
		}
		
	}
	

}
