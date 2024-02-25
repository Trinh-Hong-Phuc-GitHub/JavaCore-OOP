import java.util.Scanner;

public class MainClass {

	public static float tong3So(float a, float b, float c) {
		float ketQua = a + b + c;
		return ketQua;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Chương trình tính tổng 3 số");
		System.out.println("Mời nhập số thứ nhất: ");
		float a = Float.parseFloat(scan.nextLine());
		System.out.println("Mời nhập số thứ hai: ");
		float b = Float.parseFloat(scan.nextLine());
		System.out.println("Mời nhập số thứ ba: ");
		float c = Float.parseFloat(scan.nextLine());
		float ketQua = tong3So(a, b, c);
		System.out.println("Tổng 3 số là: " + ketQua);
		
	}

}
