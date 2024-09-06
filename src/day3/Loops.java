package day3;

public class Loops {

	public static void main(String[] args) {

//		intArray();
//		sumAndAverage();
//		sumAndAverageEx2();
//		sumAndAverageEx3();
//		sumAndAverageEx4();
//		sumEx5();
//		harmonicSum();
//		squareBoard();
//		checkerBoard();
		findCharacterInString();
		

	}
private static void findCharacterInString() {
		String str = "Hello world";
		// chuyển chuỗi thành mảng kí tự
		char[] array = str.toCharArray();
		int i = 0;
		while (i < array.length) {
			if(array[i]=='r') {
				System.out.print("Tìm thây kí tự r tại vị trí: " + i);
				break;
			}
			i++;	
		}
		if (i==array.length) {
			System.out.print("Không tìm thấy kí tự r");
		}
		
	}
// bài 9
	private static void checkerBoard() {
		int n = 7;
		for (int i = 0; i<n; i++) {
			if(i%2==0) {
				for (int j=0; j<n; j++) {
					System.out.print("#");
					if (j<n-1) {
						System.out.print(" ");
					}
				}
			}else {
				System.out.print(" ");
				for (int j=0; j<n; j++) {
					System.out.print("#");
					if (j<n-1) {
						System.out.print(" ");
					}
				
			}
		}
			System.out.println();
	}
			
	}



//Bai 8: Write a program called SquareBoard that displays 
//the following n×n (n=5) pattern using two nested for-loops.
	private static void squareBoard() {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.print("#" + " ");
			}
			System.out.println();
		}

	}

//Bai 7: Write a program called HarmonicSum to compute the sum of a harmonic.....
//Harmonic (n) = 1 + ½ + 1/3 +1/4 + …. + 1/n, n= 50000
	private static void harmonicSum() {
		int n = 50000;
		double suml2r = 0;
		double sumr2l = 0;
		// left to right
		for (int i = 1; i <= n; i++) {
			suml2r = suml2r + (double) 1 / i;
		}
		// right to left
		for (int i = n; i >= 1; i--) {
			sumr2l = sumr2l + (double) 1 / i;
		}

		double dif = sumr2l - suml2r;
		System.out.println("The sum1 is " + suml2r);
		System.out.println("The sum2 is " + sumr2l);
		System.out.println("The difference is " + dif);

	}

//	Bai 6: Modify the program to find the "sum of the squares" of all the numbers 
//	from 1 to 100, i.e. 1*1 + 2*2 + 3*3 + ... + 100*100.
	private static void sumEx5() {
		int sum = 0;
		for (int i = 1; i <= 100; i++)
			sum += i * i;
		System.out.println("The sum is " + sum);
	}

//Bai 5:Modify the program to sum those numbers from 1 to 100 that is divisible by 7, and compute the average.
	private static void sumAndAverageEx4() {
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 100; i++)
			if (i % 7 == 0) {
				sum += i;
				count++;
			}
		double avg = (double) (sum) / (double) count;
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + Math.round(avg * 100.0) / 100.0);

	}

//Bai 4: Modify the program to sum only the odd numbers from 1 to 100, and compute the average. 
	private static void sumAndAverageEx3() {
		int sum = 0;
		int count = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
				count++;
			}
		}

		double avg = (double) sum / (double) count;

		System.out.println("The sum is " + sum);
		System.out.println("The average is " + Math.round(avg * 100.0) / 100.0);

	}

	// Bai 3: Modify the first program to sum from 111 to 8899, and compute the
	// average.
	// Introduce an int variable called count to count the numbers in the specified
	// range.
	private static void sumAndAverageEx2() {
		int sum = 0;
		int count = 0;
		for (int i = 111; i <= 8899; i++) {
			sum += i;
			count++;
		}

		double avg = (double) sum / (double) count;

		System.out.println("The sum is " + sum);
		System.out.println("The average is " + Math.round(avg * 100.0) / 100.0);// average * 100.0 chuyển đổi giá trị
																				// thành một số nguyên gần nhất (bằng
																				// cách làm tròn) và sau đó chia lại cho
																				// 100.0 để đưa kết quả về dạng số thực
																				// với hai chữ số thập phân.

	}
	// Bai 2: Write a program called SumAndAverage to produce the sum of 1, 2, 3,
	// ...,
	// to 100.
	// Also compute and display the average

	private static void sumAndAverage() {
		int sum = 0;
		for (int i = 1; i <= 100; i++)
			sum = sum + i;// sum +=i;
		float avg = (float) sum / 100;
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + avg);

	}

	// Bai 1:Cho mảng a lưu giá trị dãy số a = {1,3,5,8,9}. Viết hàm in ra giá trị
	// của mảng.
	private static void intArray() {
		int a[] = { 1, 3, 5, 8, 9 };
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

}
