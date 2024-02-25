import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n, scan);
		xuatMang(a);
		inNhieuIt(a);
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập n > 0 ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[] taoMang(int n, Scanner scan) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}

	public static int[] demPhanTu(int a[]) {
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					if (j < i) {
						break;
					} else {
						b[i]++;
					}
				}
			}
		}
		return b;
	}

	public static void inNhieuIt(int a[]) {
		int b[] = demPhanTu(a);
		int Min = b[0];
		int Max = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[j] > Max) {
					Max = b[j];
				}
				if (b[j] < Min && b[j] > 0) {
					Min = b[j];
				}
			}
			if (b[i] != 0) {
				if (b[i] == Min) {
					System.out.println("Phần tử xuất hiện ít nhất: " + a[i] + " [" + b[i] + "]");
				}
				if (b[i] == Max) {
					System.out.println("Phần tử xuất hiện nhiều nhất: " + a[i] + " [" + b[i] + "]");
				}
			}
		}

	}
}
