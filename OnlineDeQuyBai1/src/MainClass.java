import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println(tinhTong(n));
	}

	public static long tinhTong(int n) {
		if(n==1) {
			return 1;
		}
		return tinhTong(n-1) + n;
	}
}
