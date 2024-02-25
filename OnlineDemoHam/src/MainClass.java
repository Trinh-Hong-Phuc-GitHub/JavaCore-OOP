import java.util.Scanner;
public class MainClass {

	public static int tinhTong(int a, int b) {
		int tong = a + b;
		return tong;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 9;
		int ketQua = tinhTong(x,y);
		System.out.println("Tổng là: " + ketQua);
	}

}
