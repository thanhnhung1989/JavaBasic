package day5_test;

public class Person {

	// Tạo lớp “Person” với thuộc tính tên và tuổi. Tạo hai đối tượng của lớp
	// “Person”,
	// thiết lập thuộc tính bằng constructor và in tên và tuổi của chúng.
	private String name;
	private String age;
	
	// Tạo constructor để thiết lập giá trị cho các thuộc tính khi tạo đối tượng
	
	public Person(String name, String age) {
		this.name = name;
		this.age = age;
	}
	// Định nghĩa các phương thức getter để truy xuất giá trị của các thuộc tính
	
	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}
	
}
