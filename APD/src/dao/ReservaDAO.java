package dao;

import java.util.List;

import model.Reserva;

/**
 * 
 * @author  Vitor, L�gia e Salom�o
 * Classe respons�vel por fazer as opera��es relacionadas as reservas
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
