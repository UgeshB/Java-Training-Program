package repeatedwords;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FileReader fr;
		 String line ;
		 ArrayList<String> al = new ArrayList<String>();
		 TreeMap<String,Integer> tm =new TreeMap<String,Integer>();
		try {
			fr = new FileReader("C:\\Users\\ugesh.basa\\Desktop\\abc.txt");
			BufferedReader br = new BufferedReader(fr);
			 while((line = br.readLine()) != null) {
	                System.out.println(line);
	                line.replaceAll(".","");
	                line.replaceAll(",","");
	                String [] words=line.split(" ");
	                for(String s : words) {
	                	if(tm.containsKey(s)) {
	                		int count =tm.get(s);
	                		tm.put(s,count+1);	
	                	}
	                	
	                	else {
	                		tm.put(s, 1);
	                	}
	                }     
			 } 
			 System.out.println(tm);
			 for(int i=0;i<3;i++) {
			 int maxValueInMap=(Collections.max(tm.values()));
		       for (Map.Entry me : tm.entrySet()) { 
		    	   if(maxValueInMap == (int)me.getValue()) {
		            String key = (String)me.getKey(); 
		            int value = ((int)me.getValue()); 
		            System.out.println(key + " : " + value); 
		            tm.remove(key);
		            break;
		    	   }
		        } 
			 }
		}
			 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 

	}

}
