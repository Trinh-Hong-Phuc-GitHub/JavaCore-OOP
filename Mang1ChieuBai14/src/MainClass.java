import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n, scan);
		xuatMang(a);
		a = xoaSoChinhPhuong(a);
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

	public static boolean kiemTraSoChinhPhuong(int x) {
		boolean chinhPhuong;
		int canBacHai = (int) Math.sqrt(x);
		if (Math.pow(canBacHai, 2) == x) {
			chinhPhuong = true;
		} else {
			chinhPhuong = false;
		}
		return chinhPhuong;
	}

	public static int demSoChinhPhuong(int a[]) {
		int dem = 0;
		for (int pt : a) {
			if (kiemTraSoChinhPhuong(pt)) {
				dem++;
			}
		}
		return dem;
	}

	public static int[] xoaSoChinhPhuong(int a[]) {
		int dem = demSoChinhPhuong(a);
		if (dem > 0) {
			int b[] = new int[a.length - dem];
			int j = 0;
			for (int i = 0; i < a.length; i++) {
				if(!kiemTraSoChinhPhuong(a[i])) {
					b[j] = a[i];
					j++;
				}
			}
			a = b;
		} else {
			System.out.println("Không có số chính phương trong mảng");
		}
		return a;
	}
}
