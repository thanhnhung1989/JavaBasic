package day2;

import java.text.DecimalFormat;
import java.util.Scanner;

//import day1.test;
import dev.failsafe.internal.util.Maths;

public class Operators {
 public static void main(String[] args) {
	 doEx2();
	
}
public void testname() throws Exception {
	int x= 1;
	System.out.println("x++:" + x++);// x++ đã tăng nhưng chưa được gán lại vào x
	
	int y=1;
	System.out.println("y++:" + ++y);// ++y đã tăng và đã gán
}
//Ex2:
private static void doEx2() {
	Scanner in = new Scanner(System.in);  
	System.out.println("Input distance in meters:");
	int distanceinmeters = in.nextInt();
	System.out.println("Input hour:");
	int hour = in.nextInt();
	System.out.println("Input minutes:");
	int minutes = in.nextInt();
	System.out.println("Input seconds:");
	int seconds = in.nextInt();
	
	int timeInsecond = hour*3600 + minutes*60 + seconds;
	double metersPerSeconds = (double)distanceinmeters/(double)timeInsecond;
	
	// convert speed to km/h
	double kilometPerHour = metersPerSeconds*3.6;
	// convert speed to miles per hour
	double milesPerHour = (double)kilometPerHour/(double)1.609;
	
	DecimalFormat df = new DecimalFormat("#.########");
	String expectedMetersPerSeconds = df.format(metersPerSeconds);
	
	String expectedkilometPerHour = df.format(metersPerSeconds);
	

	
	
	System.out.println("Your speed in meters/second is :" + expectedMetersPerSeconds);
	System.out.println("Your speed in km/h is :" + expectedkilometPerHour);
	System.out.printf("Your speed in miles/h is  %.8f%n :" , milesPerHour);// cach ngan gon hon
	
	// convert về double để sử dụng tính toán ở nơi khác
	//double convertDouble = Double.valueOf(expectedMeterOutofSeconds);


}
 
}
