import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println(tongChuSo(n));
	}

	
	public static float tongChuSo(int n) {
		if (n < 10) {
			return n;
		}
		return tongChuSo(n/10) + n%10;
	}
}
