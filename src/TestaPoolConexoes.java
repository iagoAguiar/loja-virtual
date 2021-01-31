import java.sql.SQLException;

public class TestaPoolConexoes {

	
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectonFactory = new ConnectionFactory();
		
		
		for (int i = 0; i < 20; i++) {
			connectonFactory.recuperarConexao();
			System.out.println("Conexão de número: "+ i);
			
		}
	}
}
