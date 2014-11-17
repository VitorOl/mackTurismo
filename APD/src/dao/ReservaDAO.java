package dao;

import java.util.List;

import model.Reserva;

/**
 * 
 * @author  Vitor, Lígia e Salomão
 * Classe responsável por fazer as operações relacionadas as reservas
 * no banco de dados
 *
 */
public class ReservaDAO implements GenericoDAO<Reserva> {
	
	
	List<Reserva> reservas;

	
	public List<Reserva> listar() {
		
		
		return reservas;
		
	}

	
	public void inserir(Reserva r) {
		reservas.add(r);
		
	}

	
	public void alterar(Reserva r) {
		for(int i=0;i<reservas.size();i++){
			if(reservas.get(i).equals(r)){
				reservas.add(i, r);;
			}
			
		}
		
	}

	
	public void remover(Reserva r) {
			for(int i=0;i<reservas.size();i++){
				if(reservas.get(i).equals(r)){
					reservas.remove(i);
				}	
			}
		}
		
}
