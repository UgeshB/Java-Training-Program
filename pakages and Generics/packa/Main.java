package packa;

import packa.display.displayagain;

public class Main{
	public static void main(String []args) {
	
		A a=new A();
		B b=new B();
		b.multi("hello",5);
		b.add(5, 5);
		b.print("helo world");
		System.out.println(cal.cube(4));   //static method in interface
		
	}
}


final class A implements cal,print{   //multiple inheritance 
	
	@Override
	public int add(int a, int b) {
		int c=a+b;	
		return c;
	}

	@Override
	public String multi(String a, int b) {
		String c="";
		while(b>0) {
		 c=c+a;
		 b--;
		}
		return c;
	}


	@Override
	public int back(int a) {
		// TODO Auto-generated method stub
		return a;
	}

}
class B implements display{   //since interface display extends Interface cal Class B should implement all the methods

	int sum=0;
	String multi ="";
			@Override
			public int add(int a, int b) {
				sum=a+b;	
				return sum;
			}

			@Override
			public String multi(String a, int b) {
				
				while(b>0) {
				 multi=multi+a;
				 b--;
				}
				return multi;
			}

			@Override
			public void print(String str3) {
				// TODO Auto-generated method stub
				System.out.println(str3);
				
			}
			
}
class C implements displayagain{

	@Override
	public void show(String str3) {
		// TODO Auto-generated method stub
		System.out.println("str3");
	}


	
}
	