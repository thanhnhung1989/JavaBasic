package day2;

public class DecisionMaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// tinhTong_C1(565);
 tinhTong_C2(565);
	}
	private static void tinhTong_C1(int n) {
		int tong = 0;
		
		if (n>0 && n<10) 
		{
			tong = n;
			//System.out.println("The sum of all digits in" + n + "is" + tong);
		}
		if (n>=10 && n<100) 
		{
		   tong = (n/10 ) + (n%10);
			//System.out.println("The sum of all digits in" +n + "is" + tong);
		}
		if (n>=100 && n<1000) 
		{
			tong =  (n/100) +( (n%100)/10) + (n%10);
		}
		System.out.println("The sum of all digits in " + n + " is " + tong);
	}
	//C2 use else if
	/*
	 if (n>=0 && n<1000{
	if (n>=0 && n<10) {
			tong = n;
			//System.out.println("The sum of all digits in " + n + " is " + tong );
		}else if (n>=10 &&n<100) {
			tong = (n/10) + (n%10);
			//System.out.println("The sum of all digits in " + n + " is " + tong );
		}else {
			int hangTram = n/100;
			int hangChuc = (n%100)/10;
			int hangDonVi = n%10;
			tong = hangTram + hangChuc + hangDonVi;
			
		}
		}
	 */
private static void tinhTong_C2(int n) {
	int tong = 0;
	String convertedNum = String.valueOf(n);
	for (int index = 0; index < convertedNum.length(); index ++) 
	{
		char number = convertedNum.charAt(index);// lay mot ki tu trong chuoi theo index
		int  intNumber = Character.getNumericValue(number);// bien doi ve kieu int
		tong = tong+intNumber;
	}
	System.out.println("The sum of all digits in " + n + " is " + tong);
	

}

}
