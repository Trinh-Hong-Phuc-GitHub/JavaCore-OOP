import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Mời nhập vào số n: ");
		int n = Integer.parseInt(scan.nextLine());
		float tong = tinhTong(n);
		System.out.println("Tổng: " + tong);
		float tongWhile = tinhTongBangWhile(n);
		System.out.println("Tổng: " + tongWhile);
	}

	public static float tinhTong(int n) {
		float tong = 0;
		for (int i = 1; i < n; i++) {
			if (i % 2 == 0) {
				tong += i;
			}
		}
		return tong;
	}

	public static float tinhTongBangWhile(int n) {
		float tong = 0;
		int i = 1;
		while (i < n) {
			if (i % 2 == 0) {
				tong += i;
			}
		}
		return tong;
	}
}
