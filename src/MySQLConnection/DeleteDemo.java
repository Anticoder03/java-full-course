package MySQLConnection;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteDemo {
	public static void main(String[] args) throws Exception
	{
		Connection connection=ConnectionClass.getConnection();
		
		Statement st=connection.createStatement();
		
		String query="delete from emp where ename like 'Elcid'";
		
		int rows=st.executeUpdate(query);
		System.out.println(rows + " records deleted");
		
		st.close();
		connection.close();
	}
}

