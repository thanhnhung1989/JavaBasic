package day3;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Practice1 {

	public static void main(String[] args) {
		//inViTri();
		//inVitriDungWhile();
		inVitriDungDoWhile();
		
	}
	private static void inVitriDungDoWhile() {
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("Lan");
		l.add("Huệ");
		l.add("Hương");
		l.add("Nhung");
		int viTri = 0;
		
		do {
			if (l.get(viTri).contains("Hương")) {
				System.out.println("Tim thay phan tu o vi tri:" + viTri);
			}
			viTri++;
		}while (viTri < l.size());
		
	}
	private static void inVitriDungWhile() {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Lan");
		l.add("Huệ");
		l.add("Hương");
		l.add("Nhung");
		int viTri = 0;
		while (viTri < l.size()) {
			if (l.get(viTri).contains("Hương")) {
				System.out.println("Tim thay phan tu o vi tri:" + viTri);
			}
			viTri++;
			
		}
		
	}
	/* bai 2
	 * danh sách l = {Lan, Huệ, Hương, Nhung}
		Tìm tên chứa chữ "Hương", nếu thấy, in ra vị trí phần tử.
	 */

	private static void inViTri() {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Lan");
		l.add("Huệ");
		l.add("Hương");
		l.add("Nhung");
		int viTri = 0;
		for (String x : l) {
			//viTri = viTri+1;// or ++viTri
			if (x.contains("Hương")) {
				System.out.println("Tim thay phan tu o vi tri:" + viTri);
			}
			viTri++;
			
		}

	}
	
	
}
