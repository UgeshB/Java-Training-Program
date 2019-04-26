package packb;
import packa.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	packa.print.back(4);  //default methods cannout use outside package
		
		System.out.println(new C().add(4, 5)); //calling default method
	
        Integer[] intArray = { 10, 20, 30, 40, 50 };  
        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };  
  
        System.out.println( "Printing Integer Array" );  
        printArray( intArray  );   
  
       System.out.println( "Printing Character Array" );  
        printArray( charArray );   
	    }   
		
	   public static < E > void printArray(E[] elements) {    //Generic method
	        for ( E element : elements){          
	            System.out.println(element );  
	         }  
	         System.out.println();  
	    }  
	}


class C implements cal{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		return c;
	}

	@Override
	public String multi(String a, int b) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
