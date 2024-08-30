package day3;

import java.util.Scanner;

public class HasEight {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = scanner.nextInt();
		if(hasEight(n)) {
			System.out.println(n + " co chua so 8");
		}
		else {
			System.out.println(n + " khong chua so 8");
		}
	}

	private static boolean hasEight (int n) {
		
		while(n>0) {
			if(n%10 == 8) { // lấy phần dư để kiểm tra
				return true;
			}
			n = n/10; // tiếp tục lấy phần còn lại kiểm tra
		}	
		return false;
	} 
}
