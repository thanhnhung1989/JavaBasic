package day2;

import java.time.DayOfWeek;

public class CheckEvenNumber {

	public static void main(String[] args) {
	//int number = 5;
		//checkIfEven(113);
		checkInteger(131);

	}
	
	private static void checkIfEven(int n) {
		if (n%2==0) {
			System.out.println(n + " so chan ");
	}else {
		System.out.println(n + " khong phai so chan ");
	}
	}
	
	private static void checkInteger(int n) {
		if(n%2!=0) {
			System.out.println(" Weird ");
		}
		else if(n%2==0 && n>=2 && n<=5 ) {
			System.out.println(" Not Weird ");
	}
		else if(n%2==0 && n>=6 && n<=20 ) {
			System.out.println(" Weird ");
	}
		else if(n%2==0 && n>20 ) {
			System.out.println(" Not Weird ");
	} else {
		System.out.println ("khong thoa man dieu kien");
	}
		
	}
	
}
