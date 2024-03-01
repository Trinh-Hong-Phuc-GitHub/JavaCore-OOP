import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println(tongChuSoChan(n));
	}

	public static float tongChuSoChan(int n) {
		if (n < 10 & n % 2 != 0) {
			return 0;
		}
		if ((n % 10) % 2 == 0) {
			return tongChuSoChan(n / 10) + (n % 10);
		} else {
			return tongChuSoChan(n / 10);
		}
	}
}
