package jdbc;

import java.sql.*;

public class JDBCPrepared {
	

	    public static void main(String[] args)
	    {
	        Connection connection = null;
	        PreparedStatement pstmt = null;
	        String name = "hari";
	        String address = "gg";
	        int age = 23;
	        String project= "hahah" ;
	        String id = "103";
	        String sql = "INSERT INTO EMPLOYEE (name,age,address,project,id) VALUES (?,?,?,?,?)" ; //%(name,age,address,project,id);
	        try
	        {
	            Class.forName("com.mysql.jdbc.Driver");
	            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root","root");
	             
	            pstmt = connection.prepareStatement(sql);
	            pstmt.setString(1, "Ugesh");
	            pstmt.setInt(2, 23);
	            pstmt.setString(3, "navallur");
	            pstmt.setString(4, "BCBS");
	            pstmt.setString(5, "101");
	            
	            pstmt.setInt(4, 5);
	            int affectedRows = pstmt.executeUpdate();
	            System.out.println(affectedRows + " row(s) affected !!");
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }finally {
	            try {
	                pstmt.close();
	                connection.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

