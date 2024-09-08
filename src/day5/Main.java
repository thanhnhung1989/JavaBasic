package day5;

public class Main {

	public static void main(String[] args) {
		GiaoVienToan giaoVienToan1 = new GiaoVienToan();
		GiaoVienToan giaoVienToan2 = new GiaoVienToan();
		GiaoVienToan giaoVienToan3 = new GiaoVienToan();
		
		giaoVienToan1.maGiaoVien = "001";
		giaoVienToan1.hoTen= "Nguyen Van Son1";
		giaoVienToan1.ngaySinh= "01/09/1987";
		giaoVienToan1.gioiTinh= "Nam";
		giaoVienToan1.monDay = "Toan";
		
		giaoVienToan2.maGiaoVien = "002";
		giaoVienToan2.hoTen= "Nguyen Van Son2";
		giaoVienToan2.ngaySinh= "01/09/1987";
		giaoVienToan2.gioiTinh= "Nam";
		giaoVienToan2.monDay = "Toan";
		
		giaoVienToan3.maGiaoVien = "003";
		giaoVienToan3.hoTen= "Nguyen Van Son3";
		giaoVienToan3.ngaySinh= "01/09/1987";
		giaoVienToan3.gioiTinh= "Nam";
		giaoVienToan3.monDay = "Toan";
		
		System.out.println("Giao vien toan 1: " + giaoVienToan1.hoTen);
		System.out.println("Giao vien toan 1: " + giaoVienToan1.maGiaoVien);
		System.out.println("Giao vien toan 1: " + giaoVienToan1.ngaySinh);
		System.out.println("Giao vien toan 1: " + giaoVienToan1.gioiTinh);
	}

}
