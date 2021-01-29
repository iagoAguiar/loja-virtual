import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testaConexao {

	public static void main(String[] args) throws SQLException {

		
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3307/loja_virtual?useTimezone=true&serverTimezone=UTC", "iago", "password");  

		connection.close();
	}

}
