package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Conexao {
	
	private static Conexao conexao;
		private Conexao(){
			
		}
		
		public synchronized static Conexao getInstance(){
			if(conexao == null){
				conexao = new Conexao();
			}
			return conexao;
			
		}
		
		public Connection getConnection() throws ClassNotFoundException, SQLException{
			Class.forName("banco");
			return DriverManager.getConnection("url", "usuario", "senha");
			
			
		}
}
