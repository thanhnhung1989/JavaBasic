package day3;

import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		int number = numberStudents();
		int[] grade = gradeStudents(number);
		float avg = average(grade);
		System.out.println("diem trung binh la: "+ avg);
	}
	private static int numberStudents() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so sv: ");
		int numbersv = scanner.nextInt();
		return numbersv;
	}
	private static int [] gradeStudents(int number) {
		Scanner scanner = new Scanner(System.in);
		int[] grades = new int[number];
     for(int i = 0; i<number; i++) {
    	 while(true) {
    		 System.out.println("Nhap diem sv " + (i+1) + ": ");
    		 int grade = scanner.nextInt();
    		 if (grade >=0 && grade <= 100) {
    			grades[i]= grade;
    			break;
    		 }else {
    			 System.out.println("Điểm không thỏa mãn, nhập lại ");
    		 }
    	 }
     }
     return grades;
	}
	private static float average(int[] grades) {
		float sum = 0;
		for(int grade: grades) {
			sum+=grade;
		}
		float avg = (float)sum/grades.length;
		return avg;
		
	}
	
}

