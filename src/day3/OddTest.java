package day3;

import java.util.Scanner;

public class OddTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào n: ");
		int n = scanner.nextInt();
		if(isOdd(n)) {
			System.out.println(n + " là số lẻ");
		}
		else
		{
			System.out.println(n + " là số chẵn");
		}
	}
	private static boolean isOdd (int n) {
		
		return n%2!=0;
		
	}

}
