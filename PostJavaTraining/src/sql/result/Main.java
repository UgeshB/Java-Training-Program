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
			String sql="SELECT CONCAT(firstName,' ',lastName)as 'User Full Name',p.Month AS Month,p.PaymentMode as 'Payment Mode' ,sum(p.amount) as 'Total Amount' "
					+ "from mydb.user as u  join mydb.payment as p "
					+ "where p.user_id = u.id "
					+ "group by p.PaymentMode,p.Month";
			ResultSet rs= stmt.executeQuery(sql);
			System.out.println(rs);
			System.out.print("User Full Name");
			System.out.print("\tMonth");
			System.out.print("\tPayment Mode");
			System.out.print("\tTotal amount");
			System.out.println();
			while(rs.next()) {
				System.out.print(rs.getString("User Full Name"));
				System.out.print("\t"+rs.getString("Month"));
				System.out.print("\t"+rs.getString("Payment Mode"));
				System.out.print("\t\t"+rs.getString("Total Amount"));
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

