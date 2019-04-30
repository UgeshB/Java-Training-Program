package sql.result;
import java.sql.*;


public class Main {
	  	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/mydb";
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
			String sql= "SELECT CONCAT(firstName,lastName)as Name,p.PaymentMode as PaymentMode ,p.amount as Amount ,p.Month AS Month from mydb.user as u  join mydb.payment as p where p.user_id = u.id"; 
			ResultSet rs= stmt.executeQuery(sql);
			System.out.println(rs);
		
			while(rs.next()) {
				System.out.print(" Name :  "+rs.getString("Name"));
				System.out.print(" PaymentMode :  "+rs.getString("PaymentMode"));
				System.out.print(" Aamount :  "+rs.getString("Amount"));
				System.out.print(" Month :  "+rs.getString("Month"));
				System.out.println();
			}
			}
			catch(Exception e){
				System.out.println(e);
					try {
						con.close();
						stmt.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				System.out.println(e);
			}
	}
}

