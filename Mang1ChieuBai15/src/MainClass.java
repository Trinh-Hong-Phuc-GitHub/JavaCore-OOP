import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n, scan);
		xuatMang(a);
		a = dichMang(scan, a);
		xuatMang(a);
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

	public static int[] dichMang(Scanner scan, int a[]) {
		int tam;
		int k;
		do {
			System.out.println("Dịch bao nhiêu lần: ");
			k = Integer.parseInt(scan.nextLine());
		} while (k < 0);
		k %= a.length;
		for (int i = 0; i < k; i++) {
			tam = a[a.length - 1];
			for (int j = a.length-1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[0] = tam;
		}
		return a;
	}
}