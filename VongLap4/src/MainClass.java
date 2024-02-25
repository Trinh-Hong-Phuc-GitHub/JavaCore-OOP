import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập x: ");
		int x = Integer.parseInt(scan.nextLine());
		tinhTong(n, x);
	}

	public static void tinhTong(int n, int x) {
		int sum = 0;
		int soGia = x;
		for(int i = 0; i < n; i++) {
			sum += soGia;
			soGia *= x;
		}
		System.out.println("Tổng: " + sum);
	}
}
