import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println(tongPhanSo(n));
	}

	public static float tong(int n) {
		if (n == 1) {
			return 1;
		}
		return tong(n - 1) + n;
	}

	public static float tongPhanSo(int n) {
		if (n == 1) {
			return 1;
		}
		return tongPhanSo(n - 1) + 1 / (tong(n - 1) + n);
	}
}
