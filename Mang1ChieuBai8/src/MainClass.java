import java.util.Scanner;

public class MainClass {

	final static int MIN = -1000;
	final static int MAX = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		int tong = tongLonHonTriTuyetDoiSau(a);
		System.out.println("Tổng: " + tong);
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập n > 0");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * (MAX - MIN) + 1);
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}
	
	public static int tongLonHonTriTuyetDoiSau(int a[]) {
		int tong = 0;
		for(int i = 1; i < a.length; i++) {
			if(Math.abs(a[i]) > Math.abs(a[i-1])) {
				tong += a[i];
				System.out.println(a[i] + " & " + a[i-1]);
			}
		}
		return tong;
	}
}
