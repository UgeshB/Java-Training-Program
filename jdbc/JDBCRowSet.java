package jdbc;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.Statement;  
import javax.sql.RowSetEvent;  
import javax.sql.RowSetListener;  
import javax.sql.rowset.JdbcRowSet;  
import javax.sql.rowset.RowSetProvider; 

public class JDBCRowSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
		  Class.forName("com.mysql.jdbc.Driver");
		
		
		
		
		     JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();  
		        rowSet.setUrl("jdbc:mysql://127.0.0.1:3306/mydb");  
		        rowSet.setUsername("root");  
		        rowSet.setPassword("root");  
		                   
		        rowSet.setCommand("select * from employee");  
		        rowSet.execute(); 
		
                   
    while (rowSet.next()) {  
                        // Generating cursor Moved event  
                        System.out.println("name: " + rowSet.getString(1));  
                        System.out.println("age: " + rowSet.getInt(2));  
                        System.out.println("addres: " + rowSet.getString(3)); 
                        System.out.println("project: " + rowSet.getString(4)); 
                        System.out.println("id: " + rowSet.getString(5)); 
                } 
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
