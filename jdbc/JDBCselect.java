package jdbc;

import java.sql.*;

public class JDBCselect {
	  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/mydb";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";


	public static void main(String[] args) {

			
			Connection con = null;
			Statement stmt = null;
			try
			{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",USER,PASS); 
			
			stmt = con.createStatement(); 
			String sql= "Select * from employee";
			ResultSet rs= stmt.executeQuery(sql);
			System.out.println("printing ResultSetMetaData");
			ResultSetMetaData rsmd=rs.getMetaData();   //ResultSetMetaData 
			System.out.println("Column count"+rsmd.getColumnCount());
			System.out.println("Type of 2nd column"+rsmd.getColumnTypeName(2));
			DatabaseMetaData dbmd=con.getMetaData(); 
			
			
			System.out.println("printng DatabaseMetaData ");	//DatabaseMetaData
			System.out.println("Driver Name: "+dbmd.getDriverName());  
			System.out.println("Driver Version: "+dbmd.getDriverVersion());  
			System.out.println("UserName: "+dbmd.getUserName());  
			System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
			System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion()); 
			 while(rs.next())
			 {
				 String ID = rs.getString("ID");
				 String name= rs.getString("Name");
				 String address = rs.getString("address");
				 String project = rs.getString("project");
				 int age = rs.getInt("age");
				 
				 System.out.println("ID ="+ ID);
				 System.out.println("Name ="+ name);
				 System.out.println(" age="+ age);
				 System.out.println("project ="+ project);
				 System.out.println("address="+ address);
	
			 }
			}
			catch(Exception e) {
				System.out.println(e);
			}
			finally {
				try {
					stmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			// Accessing without DSN
			
//			 try{   
//				   Connection c = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=jdbc:mysql://127.0.0.1:3306/mydb");
//				   Statement st=c.createStatement();  
//				   ResultSet rs=st.executeQuery("select * from login");  
//				    
//				   while(rs.next()){  
//				    System.out.println(rs.getString(1));  
//				   }  
//				  
//				}catch(Exception ee){System.out.println(ee);}  
//				  
	}

}
