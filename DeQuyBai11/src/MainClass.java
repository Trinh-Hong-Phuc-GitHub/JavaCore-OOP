import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println(demChuSoLe(n));
	}

	public static int demChuSoLe(int n) {
		if (n < 10 & n % 2 == 0) {
			return 0;
		}
		if ((n % 10) % 2 != 0) {
			return demChuSoLe(n / 10) + 1;
		} else {
			return demChuSoLe(n / 10);
		}
	}
}
