package second;

import java.util.Date;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int id;
		String  firstname;
		String lastname;
		String dob;
		String address;
		String details;
		System.out.println("Enter details");
		id=sc.nextInt();
		firstname = sc.nextLine();
		lastname = sc.nextLine();
		dob = sc.nextLine();
		address = sc.nextLine();
		details=firstname+","+lastname+","+dob+","+address;
		HashMap<Integer,String> se = new HashMap<Integer,String>();
		if(se.containsKey(id)) {
			System.out.println("Voter details aleady added");
		}
		else {
		se.put(id, details);
		}	

	}

}

