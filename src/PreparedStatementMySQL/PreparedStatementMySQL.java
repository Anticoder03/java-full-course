package PreparedStatementMySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import MySQLConnection.ConnectionClass;

public class PreparedStatementMySQL {
	public static void main(String[] args) throws Exception{
		Connection con = ConnectionClass.getConnection();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee Number: ");
		int e_no = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Employee Name: ");
		String e_name = sc.nextLine();
		
		System.out.println("Emploee Sallary: ");
		double e_sal = sc.nextDouble();
		
		
		String query = "INSERT INTO emp VALUES(?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, e_no);
		ps.setString(2, e_name);
		ps.setDouble(3, e_sal);
		
		int rows = ps.executeUpdate();
		System.out.println(rows + " records Inserted.");
		
		
		
		
	}
}
