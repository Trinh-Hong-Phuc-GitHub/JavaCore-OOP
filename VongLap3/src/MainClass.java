import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		tongLe(n);
	}
	
	public static int nhapN (Scanner scan) {
		int n;
		do {
			System.out.println("Nhập n > 0: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n<=0);
		return n;
	}

	public static void tongLe (int n) {
		int sum = 0;
		for (int i = 1; i < n; i+=2) {
			sum +=i;
		}
		System.out.println("Tổng lẻ: " + sum);
	}
}
