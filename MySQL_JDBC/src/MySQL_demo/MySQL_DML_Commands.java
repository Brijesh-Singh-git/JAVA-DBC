package MySQL_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL_DML_Commands {

	
	public static void main(String[] args) throws SQLException {
		
		//1. Create a Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		
		//2. Create Statement or Query
		Statement stmt = con.createStatement();
		//String s = "INSERT INTO STUDENT VALUES(03, 'Brijesh', 458720 )";
		//String s2 = "INSERT INTO STUDENT VALUES(04, 'Pushakr', 789525 )";
		
		//String s = "UPDATE STUDENT SET NAME = 'WALTER' WHERE SNO = 2";
		
		String s = "DELETE FROM STUDENT WHERE SNO = 4";
		
		
		
		//3. Execute statement/Query
		stmt.execute(s);
		//stmt.execute(s2);
		
		//4.Close Connection 
		con.close();
		
		System.out.println("Query Executed Successfully!!!");
		
		
	}


}
