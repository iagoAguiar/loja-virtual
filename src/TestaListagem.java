import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {

		
		Connection con = DriverManager 
				.getConnection("jdbc:mysql://localhost:3307/loja_virtual?useTimezone=true&serverTimezone=UTC", "iago", "password");  
		
		
		
		Statement stm = con.createStatement();
		  stm.execute("SELECT ID, NOME, DESCRICAO FROM produto");
		
		  ResultSet rst = stm.getResultSet();
		  
		  while(rst.next()) {
			  Integer id = rst.getInt("ID");
			  System.out.println(id);
			  
			  String nome = rst.getString("NOME");
			  System.out.println(nome);
			  
			  String descricao = rst.getString("DESCRICAO");
			  System.out.println(descricao);
		  }
	
		
		con.close();

	



 
	}
}