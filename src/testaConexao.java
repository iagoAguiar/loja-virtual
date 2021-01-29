import java.sql.Connection;
import java.sql.SQLException;

public class testaConexao {

	public static void main(String[] args) throws SQLException {

		

		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection connection = criaConexao.recuperarConexao();
		
		System.out.println("Fechando a conexão!!");

		connection.close();
	}

}
