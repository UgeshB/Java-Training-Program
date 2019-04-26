package ennumautoboxingwrapper;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maiin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		city c;
		c=city.hyd;
		c=city.valueOf("chennai");
		System.out.println(c);
		city [] ci=city.values();
		for(city c1:ci) {
			System.out.println(c1+" polulation "+c1.getpopulation());
			System.out.println(c1+" ordinal "+c1.ordinal());
			//EnumSet
			System.out.println("EnumSet");
			  Set<city> set = EnumSet.allOf(city.class);  
			  System.out.println("city with allOf :"+set); 
			    // Traversing elements  
			    Iterator<city> iter = set.iterator();  
			    while (iter.hasNext())  
			      System.out.println(iter.next());  
			    Set<city> set1 = EnumSet.noneOf(city.class);  
			    // Traversing elements  
			    System.out.println("city with noneOf :"+set1);  
			    
			    //EnumMap
			    
			    EnumMap<city, String> map = new EnumMap<city, String>(city.class);  
			    map.put(city.chennai, "1");  
			    map.put(city.mumbai, "2");  
			    map.put(city.hyd, "3");  
			    map.put(city.vizag, "4");  
			    // print the map  
			    for(Map.Entry m:map.entrySet()){    
			        System.out.println(m.getKey()+" "+m.getValue());    
			       }   
			    
			    
			    
			//Wrappers
			    System.out.println("Wrappers");
			
			Integer iOb = new Integer(100); 		//numeric type wrapper
			int i = iOb.intValue();
			 
			Character ch =new Character('c');		//character type wrapper
			char cha = ch.charValue();
			
			
			Integer iOb1 = 100; // autobox an int
			int i1 = iOb1; // auto-unbox
			
			System.out.println(unboxing(iOb1));
			System.out.println(autoboxing(i1));
		}
	}

	private static Integer autoboxing(int i1) {
		// TODO Auto-generated method stub
		return i1;
		
	}

	private static int unboxing(Integer iOb1) {
		// TODO Auto-generated method stub
		return iOb1;   //auto un-boxing
		
	}

}
