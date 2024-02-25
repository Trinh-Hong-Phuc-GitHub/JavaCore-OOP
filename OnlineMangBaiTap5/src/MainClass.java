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
		System.out.println("\n");
		lietKe(a);
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
	}

	public static boolean kiemTraChuSoDauTienLaLe(int x) {
		boolean laLe;
		x = Math.abs(x);
		while (x >= 10) {
			x /= 10;
		}
		if (x % 2 == 0) {
			laLe = false;
		} else {
			laLe = true;
		}
		return laLe;
	}
	
	public static void lietKe(int a[]) {
		for(int pt: a) {
			if(kiemTraChuSoDauTienLaLe(pt)) {
				System.out.print(pt + "\t");
			}
		}
	}
}
