package MySQLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");  //"com.mysql.cj.jdbc.Driver" mysql 8.0.3 jar
		Connection connection = DriverManager.getConnection(
			    "jdbc:mysql://localhost:3306/excelrworldcupdb",
			    "root",
			    ""
			);
		
		String query = "insert into emp values(6,'Chris',1000.00)";
		Statement st  = connection.createStatement();
		int rows = st.executeUpdate(query);
		
		System.out.println("inserted rows : " + rows);
		
		// Batch execution
		
		String query2 = "INSERT INTO emp VALUES(2, 'Rahul', 1500.50)";
		String query3 = "INSERT INTO emp VALUES(3, 'Priya', 2200.75)";
		String query4 = "INSERT INTO emp VALUES(4, 'Neha', 1800.00)";
		String query1 = "INSERT INTO emp VALUES(5, 'Ansh', 1000.00)";
		
		st.addBatch(query1);
		st.addBatch(query2);
		st.addBatch(query3);
		st.addBatch(query4);
		
//		int rows [] = st.executeBatch();
		System.out.println("Batch executed ");
		
		
		
		
		
	}
}
