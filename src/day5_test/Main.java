package day5_test;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("Mai", "20");
		Person person2 = new Person("Lan", "23");
		// in thong tin
		
		System.out.println("Person 1: "+ person1.getName() + ", " + person1.getAge() + " years old");
		System.out.println("Person 2: "+ person2.getName() + ", " + person2.getAge() + " years old");

	}

}
