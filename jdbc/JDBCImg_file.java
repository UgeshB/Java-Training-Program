package jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.*;

public class JDBCImg_file {
	  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/mydb";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";

	public static void main(String[] args) {
		 Connection con = null;
		   Statement stmt = null;
		// TODO Auto-generated method stub
		   try {
		  Class.forName("com.mysql.jdbc.Driver");
	      System.out.println("Connecting to database...");
	      con = DriverManager.getConnection(DB_URL,USER,PASS);
				stmt = con.createStatement(); 
				String sql = "CREATE TABLE IF NOT EXISTS mydb.imgfile(NAME VARCHAR(4000),PHOTO BLOB,FILE BLOB)";
			      stmt.execute(sql);
			      System.out.println("Table created successfully...");
		             //   file and image storing and retrieving
			      PreparedStatement ps=con.prepareStatement("insert into imgfile values(?,?,?)");  

			      File f=new File("d:\\test.txt");  
			      FileReader fr=new FileReader(f);
			      
			      FileInputStream fin=new FileInputStream("d:\\Desert.jpg");  
			      ps.setInt(1,101);  
			      ps.setBinaryStream(2,fin,fin.available()); 
			     
			      ps.setCharacterStream(3,fr,(int)f.length()); 
			      int affectedRows = ps.executeUpdate();
		            System.out.println(affectedRows + " row(s) affected !!");
		            System.out.println("Image and file added Sucessfully ");
		            
		            PreparedStatement ps1=con.prepareStatement("select * from imgfile");  
		            ResultSet rs=ps1.executeQuery();  
		            if(rs.next()){//now on 1st row  
		            	Blob c=rs.getBlob(2);  
		            	 byte barr1[]=c.getBytes(1,(int)c.length());             
		            	              
		            	 FileOutputStream fout1=new FileOutputStream("d:\\retrive.txt");  
				            fout1.write(barr1);  
				            fout1.close(); 
			            Blob b=rs.getBlob(3); 
			            byte barr[]=b.getBytes(1,(int)b.length()); 
			                          
			            FileOutputStream fout=new FileOutputStream("d:\\sonoo.jpg");  
			            fout.write(barr);  
			            fout.close();  
		            }//end of if  
		            
		            System.out.println("image and file retrived Sucessfully"); 
				}
				catch(Exception e)
				{
					 e.printStackTrace();
				}
				finally {
					
				}
		   
	}

	private static Reader getCharacterStream() {
		// TODO Auto-generated method stub
		return null;
	}

}
