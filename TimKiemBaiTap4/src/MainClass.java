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
		int index = soNguyenToCuoiCung(a);
		if (index != -1) {
			System.out.println("Số nguyên tố cuối cùng: " + a[index]);
		} else {
			System.out.println("Không có số nguyên tố");
		}
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

	public static int soNguyenToCuoiCung(int a[]) {
		int index = -1;
		for (int i = a.length - 1; i > 0; i--) {
			boolean flag = true;
			if (a[i] <= 1) {
				flag = false;
			}
			for (int j = 2; j <= Math.sqrt(a[i]); j++) {
				if (a[i] % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				index = i;
				break;
			}
		}
		return index;
	}
}
