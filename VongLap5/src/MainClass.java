import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = Integer.parseInt(scan.nextLine());
		tinhGiaiThua(n);
	}

	public static void tinhGiaiThua(int n) {
		int giaiThua = 1;
		int a = 1;
		if (n == 0 || n == 1) {
			giaiThua = 1;
		} 
		else {
			for (int i = 0; i < n; i++) {
				giaiThua *= a;
				a += 1;
			}
		}
		System.out.println( n + "! = " + giaiThua);
	}
}
