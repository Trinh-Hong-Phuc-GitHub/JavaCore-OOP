import java.util.Scanner;

public class MainClass {

	final static int MIN = -20;
	final static int MAX = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		System.out.println("\n");
		System.out.println("Mảng sau khi thêm: ");
		a = themPhanTu(a, scan);
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

	public static int[] themPhanTu(int a[], Scanner scan) {
		int k;
		do {
			System.out.println("Nhập k từ 0 đến " + a.length + " : ");
			k = Integer.parseInt(scan.nextLine());
		} while (k < 0 || k > a.length);
		System.out.println("Vui lòng nhập giá trị phần tử cần thêm x = ");
		int x = Integer.parseInt(scan.nextLine());
		int b[] = new int[a.length + 1]; // tạo mảng tạm với kích thước tăng thêm 1
		for (int i = 0; i < b.length; i++) {
			if (i < k) {
				b[i] = a[i];
			} else if (i == k) {
				b[i] = x;
			} else {
				b[i] = a[i - 1];
			}
		}
		a = b; // gán mạng tạm về cho mảng gốc
		return a;
	}

}
