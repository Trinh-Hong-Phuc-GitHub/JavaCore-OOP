import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n, scan);
		xuatMang(a);
		System.out.println("\n");
		demSoLanXXuatHien(scan, a);
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
	}

	public static void demSoLanXXuatHien(Scanner scan, int a[]) {
		System.out.println("Nhập x: ");
		int x = Integer.parseInt(scan.nextLine());
		int dem = 0;
		for(int i =0; i < a.length;i++) {
			if(a[i]==x) {
				dem++;
			}
		}
		System.out.println("Số lần x xuất hiện: " + dem);
	}
}
