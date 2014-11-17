package dao;

import java.util.Iterator;
import java.util.List;

import model.Passageiro;




/**
 * 
 * @author  Vitor, Lígia e Salomão
 * Classe responsável por fazer as operações relacionadas a passageiros 
 * no banco de dados
 *
 */
public class PassageiroDAO implements GenericoDAO<Passageiro> {
	
	
	List<Passageiro> passageiros;

	public List<Passageiro> listar() {
		
		
		return passageiros;
		
	}

	public void inserir(Passageiro p) {
		passageiros.add(p);
		
	}

	
	public void alterar(Passageiro p) {
		
		for(int i=0;i<passageiros.size();i++){
			if(passageiros.get(i).equals(p)){
				passageiros.add(i, p);;
			}
			
		}
		
	}

	
	public void remover(Passageiro p) {
		
		for(int i=0;i<passageiros.size();i++){
			if(passageiros.get(i).equals(p)){
				passageiros.remove(i);
			}	
		}
	}
}

	
	


