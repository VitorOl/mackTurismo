package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VooDAO implements GenericoDAO<Voo> {

	@Override
	public List<Voo> listar() {
		try {
			Connection connection = Conexao.getInstance().getConnection();
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM tabela");
			
			while (result.next()){
				Voo voos = new Voo();
				voos.setNome(result.getString("NOME"));
				voos.setFone(result.getString("FONE"));
				voos.setEmail(result.getString("EMAIL"));
				voos.setCpf(result.getInt("CPF"));
				
				voos.add(passageiro);
			}
			connection.close();
		} catch (ClassNotFoundException e) {
			Logger.getLogger(PassageiroDAO.class.getName()).log(Level.SEVERE,null, e);
		} catch (SQLException e) {
			Logger.getLogger(PassageiroDAO.class.getName()).log(Level.SEVERE,null, e);
		}
		
		return passageiros;
	}
	}

	@Override
	public void inserir(Voo e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Voo e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Voo e) {
		// TODO Auto-generated method stub
		
	}
	

}
