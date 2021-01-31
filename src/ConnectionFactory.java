import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;



public class ConnectionFactory {
	
	public DataSource dataSource; 
	
	
	
	public ConnectionFactory(){
				
		
		ComboPooledDataSource combopooledDataSource = new ComboPooledDataSource();
		combopooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3307/loja_virtual?useTimezone=true&serverTimezone=UTC");
		combopooledDataSource.setUser("iago");
		combopooledDataSource.setPassword("password");
		
		combopooledDataSource.setMaxPoolSize(15);
		
		this.dataSource = combopooledDataSource;
		
	}
	
	public  Connection  recuperarConexao() throws SQLException {
		
		return this.dataSource.getConnection();
		
		
		
	}

}
