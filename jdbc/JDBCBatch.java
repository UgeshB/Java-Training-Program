package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCBatch {

	 // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/mydb";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";
	   
	   public static void main(String[] args) {
	   Connection con = null;
	   Statement stmt = null;
	   try{
	      Class.forName("com.mysql.jdbc.Driver");
	      System.out.println("Connecting to database...");
	      con = DriverManager.getConnection(DB_URL,USER,PASS);
				stmt = con.createStatement(); 

			stmt.addBatch("insert into employee values('hari',24,'abhi','asas','410')");  
			stmt.addBatch("insert into employee values('hari',24,'abhi','asas','4010')");  
			  
			stmt.executeBatch();//executing the batch  
			System.out.println("Inseted using batch ");
	   }
		catch(Exception e)
		{
			 e.printStackTrace();
		}
		finally
		{
			 try
			 {
		         if(stmt!=null)
		            stmt.close();
		      }
			 catch(SQLException se2)
			 {
		     se2.printStackTrace(); 
			 }
		      try
		      {
		         if(con!=null)
		            con.close();
		      }
		      catch(SQLException se)
		      {
		    	  se.printStackTrace(); 
		      }
		           
} 
	}

}
