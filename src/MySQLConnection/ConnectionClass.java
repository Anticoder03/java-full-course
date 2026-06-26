package MySQLConnection;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
	
	static Connection connection = null;
	static final String databasURL="jdbc:mysql://localhost:3306/";
	static final String databaseName="excelrworldcupdb";
	static final String databaseUserName="root";
	static final String databasePassword="";
	
	
	public static Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");   //"com.mysql.cj.jdbc.Driver" mysql 8.0.3 jar
		connection = DriverManager.getConnection(
				databasURL+databaseName, databaseUserName, databasePassword
		);
		return connection;
	}	
	
}
