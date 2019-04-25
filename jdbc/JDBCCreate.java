package jdbc;


import java.sql.*;
public class JDBCCreate {

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
				String sql = "CREATE TABLE IF NOT EXISTS mydb.Employee(name VARCHAR(100),age INTEGER,address VARCHAR(100),project VARCHAR(100),id VARCHAR(100) PRIMARY KEY)";
			      stmt.execute(sql);
			      System.out.println("Table created successfully...");
				
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
