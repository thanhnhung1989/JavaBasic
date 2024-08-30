package day1;

public class DataTypesAndVariables {
	
public static void main(String[] args) {
	//ex1
	doEx1();
	//ex2
	//doEx2();
	DataTypesAndVariables dataTypesAndVariables = new DataTypesAndVariables();
	dataTypesAndVariables.doEx2();
	dataTypesAndVariables.doEx3();
	dataTypesAndVariables.doEx4();
}

private  void doEx2() {
	// TODO Auto-generated method stub
	System.out.println("++++++\r\n"
			+ "@@@@@@\r\n"
			+ "******\r\n"
			+ "######");
}

//ex1
private static void doEx1() {
	// TODO Auto-generated method stub
	System.out.println("Hello World");
}
private void doEx3() {
int a = 10;
double b= 20.3;
double c = 3.14785;
System.out.println(a);
System.out.println(b);
System.out.println(c);

}
private void doEx4() {
	Boolean a = true; 
	a = false;
System.out.println(a);
}

}
