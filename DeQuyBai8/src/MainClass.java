import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println(demChuSo(n));
	}

	public static float demChuSo(int n) {
		if (n < 10) {
			return 1;
		}
		return demChuSo(n/10) + 1;
	}
}
