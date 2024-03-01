import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập x: ");
		int x = Integer.parseInt(scan.nextLine());
		System.out.println(tong(n,x));
	}

	public static float luyThua(int n, int x) {
		if (n == 1) {
			return x;
		}
		return luyThua(n - 1,x)*x;
	}

	public static float tong(int n, int x) {
		if (n == 1) {
			return x;
		}
		return tong(n - 1,x) + luyThua(n-1,x)*x;
	}
}
