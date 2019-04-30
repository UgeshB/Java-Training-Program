package pattern;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		for(int i =num*2;i>=num;i--)
		{
			for(int j=0;j<num*2;j++) {
				if(j>=i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();	
		}
	
		for(int i =num;i>0;i--)
		{
			for(int j=0;j<num*2;j++) {
				if(j<i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
					
			}
			System.out.println();
		}

	}

}
