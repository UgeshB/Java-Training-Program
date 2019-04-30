package vocher.card.validation;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al =new ArrayList<Integer>();
		ArrayList<Integer> al1 =new ArrayList<Integer>();
		System.out.println("Enter digis");
		int dig=Integer.parseInt(sc.nextLine());
		int j=1,sum=0;
		while(dig>0) {
			int digit = dig%10;
			al.add(digit);
			dig=dig/10;
			if(j%2==0) {
				digit=digit*2;
			}
			 al1.add(digit);
			sum=sum+digit;
			j++;
		}
		System.out.println("digits:"+al);
		System.out.println("After double"+al1);
		System.out.println("sum:"+sum);


	}



}
