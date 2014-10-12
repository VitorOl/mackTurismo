package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;





public class PassageiroDAO implements GenericoDAO<Passageiro> {

	@Override
	public List<Passageiro> listar() {
		List<Passageiro> passageiros = new ArrayList<Passageiro>();
		try {
			Connection connection = Conexao.getInstance().getConnection();
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM tabela");
			
			while (result.next()){
				Passageiro passageiro = new Passageiro();
				passageiro.setNome(result.getString("NOME"));
				passageiro.setFone(result.getString("FONE"));
				passageiro.setEmail(result.getString("EMAIL"));
				passageiro.setCpf(result.getInt("CPF"));
				
				passageiros.add(passageiro);
			}
			connection.close();
		} catch (ClassNotFoundException e) {
			Logger.getLogger(PassageiroDAO.class.getName()).log(Level.SEVERE,null, e);
		} catch (SQLException e) {
			Logger.getLogger(PassageiroDAO.class.getName()).log(Level.SEVERE,null, e);
		}
		
		return passageiros;
	}

	@Override
	public void inserir(Passageiro p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Passageiro p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Passageiro p) {
		// TODO Auto-generated method stub
		
	}

	
	

}
