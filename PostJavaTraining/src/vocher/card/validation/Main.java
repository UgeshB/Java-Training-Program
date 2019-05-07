package vocher.card.validation;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> digits =new ArrayList<Integer>();
		ArrayList<Integer> doubleDigits =new ArrayList<Integer>();
		System.out.println("Enter digis");
		String dig=sc.nextLine();
		int j=1,sum=0;
		int length=dig.length();
		for(int i=length-1;i>=0;i--) {
			int digit=Integer.parseInt(dig.charAt(i)+"");
			digits.add(digit);
			if(j%2==0) {
				digit=digit*2;
				if(digit>9) {
					int one =digit%10;
					int second=digit/10;
					digit=one+second;
				}	
			}
			doubleDigits.add(digit);
			sum=sum+digit;
			j++;
		}
		System.out.print("Digits \t:");
		for(int i=length-1;i>=0;i--) {
		System.out.print(" "+digits.get(i));
		}
		System.out.println();
		System.out.print("After Doubling: ");
		for(int i=length-1;i>=0;i--) {
			System.out.print(" "+doubleDigits.get(i));
			}
		System.out.println();
		System.out.println("sum of digits:"+sum);
		if(sum%10==0) {
			System.out.println("Valied Vocher Card");
		}
		else {
			System.out.println("Invaid Vocher card");
		}
	}
}
