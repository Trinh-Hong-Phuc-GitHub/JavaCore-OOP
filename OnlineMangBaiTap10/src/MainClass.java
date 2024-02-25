import java.util.Scanner;

public class MainClass {

	final static int MIN = -100;
	final static int MAX = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		System.out.println("\n");
		int dem = demPhanTuCoDieuKien(a);
		System.out.println("Số phần tử thỏa điều kiện: " + dem);
		a = gapDoiPhanTuLe(a);
		xuatMang(a);
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

	public static int demPhanTuCoDieuKien(int a[]) {
		int dem = 0;
		for (int pt : a) {
			if (pt % 4 == 0 && Math.abs(pt) % 10 == 6) {
				dem++;
			}
		}
		return dem;
	}

	public static int[] gapDoiPhanTuLe(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				a[i] = a[i] * 2;
			}
		}
		return a;
	}
}
