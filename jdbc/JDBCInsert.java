package jdbc;

import java.sql.*;
import java.util.Scanner;



public class JDBCInsert {
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
				   System.out.println();
			      Class.forName("com.mysql.jdbc.Driver");
			      System.out.println("Connecting to database...");
			      con = DriverManager.getConnection(DB_URL,USER,PASS);
						stmt = con.createStatement(); 
						String sql = "INSERT INTO mydb.employee(name,age,address,project,id) VALUES ('Nani',23,'BCBS','sholing','1011')";
						  stmt.execute(sql);
					       System.out.println("Values Inserted successfully...");
					//Inserting using callable procedure
					       System.out.println("Insertig using callable procedure");
					       
					       CallableStatement cstmt=con.prepareCall("{call new_procedure(?,?,?,?,?)}");  
					       cstmt.setString(1, "Ugesh");
					       cstmt.setInt(2, 23);
					       cstmt.setString(3, "navallur");
					       cstmt.setString(4, "BCBS");
					       cstmt.setString(5, "101");
				            
					       cstmt.setInt(4, 105);
					       System.out.println("Insted using callable statement");
					       con.commit();//Transaction Manageent
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
						     try {
								con.rollback();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
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

