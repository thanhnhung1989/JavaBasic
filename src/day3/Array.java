package day3;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
//		int number = getNumberOfStudent();
//		int[] grade = getGradeOfStudent(number);
//		float average = average(grade);
//		int[] array = {0,1,2};
//		 printArray( array);

//		double[] array = {0,1,2};
//		 printArray( array);
//		
//		float[] array = { 0, 1, 2 };
//		printArray(array);
		
		int [] number = {};
		String str = arrayToString(number);
		System.out.println(str);
	}

	private static int getNumberOfStudent() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of student: ");
		return scanner.nextInt();

	}

	private static int[] getGradeOfStudent(int numStudent) {
		Scanner scanner = new Scanner(System.in);
		int[] grades = new int[numStudent];// tao mang luu diem sinh vien
		for (int i = 0; i < numStudent; i++) {
			while (true) {
				System.out.println("Enter grade of student " + (i + 1) + ":");
				int grade = scanner.nextInt();
				if (grade >= 0 && grade <= 100) {
					grades[i] = grade;// luu diem vao mang
					break;
				} else {
					System.out.println("Grade invalid, please enter again");
				}
			}
		}
		return grades;

	}

	private static float average(int[] grades) {
		float sum = 0;

		for (int grade : grades) {
			sum += grade;
		}
		float avg = (float) sum / grades.length;

		System.out.println("The average is: " + avg);
		return avg;
	}

// in mảng int[]
	private static void printArray(int[] array) {
		if (array.length > 0) {
			System.out.print("{");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]);
				if (i < (array.length - 1)) {
					System.out.print(",");// them dau phay giua cac phan tu
				}
			}
			System.out.println("}");
		} else {
			System.out.println("Mang ko co phan tu");
		}
	}

	// in mảng float
	private static void printArray(float[] array) {
		if (array.length > 0) {
			System.out.print("{");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]);
				if (i < array.length - 1) {
					System.out.print(",");// them dau phay giua cac phan tu
				}
			}
			System.out.println("}");
		} else {
			System.out.println("Mang ko co phan tu");
		}
	}

	// in mảng double
	private static void printArray(double[] array) {
		if (array.length > 0) {
			System.out.print("{");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]);
				if (i < array.length - 1) {
					System.out.print(",");// them dau phay giua cac phan tu
				}
			}
			System.out.println("}");
		} else {
			System.out.println("Mang ko co phan tu");
		}
	}
	
	private static String arrayToString(int[] array) {
		StringBuilder sb = new StringBuilder();
		if(array.length == 0) {
			return "{}";
		}
		sb.append("{");
		if (array.length > 0) {
			for (int i = 0; i < array.length; i++) {
				sb.append(array[i]);
				if (i < array.length - 1) {
					sb.append(",");
				}	
			}
			sb.append("}");
		}

		return sb.toString();

	}

}
