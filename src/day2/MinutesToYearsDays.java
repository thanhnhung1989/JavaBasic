package day2;

import java.util.Scanner;

public class MinutesToYearsDays {

	public static void main(String[] args) {
		// Tạo đối tượng scanner để đọc dữ liệu đầu vào
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the number of munites:");
		long munites= scanner.nextLong();// đọc số phút từ người dùng
		
		// Tính số ngày và số năm
		final long munnitestoyear = 525600; // Số phút trong một năm (365 ngày)
		final long munitestoday = 1440;// Số phút trong một ngày
		
		long year = munites/munnitestoyear;
		long remainMunites = munites%munnitestoyear;
		long day = remainMunites/munitestoday;
		
		System.out.println(munites + " minutes is approximately " + year + " years and " + day +" days ");

	}
 
}
