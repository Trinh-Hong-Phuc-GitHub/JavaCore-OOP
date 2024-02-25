import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n, scan);
		xuatMang(a);
		LietKe(a);
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập số phần tử của mảng:");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[] taoMang(int n, Scanner scan) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = ");
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

	public static boolean kiemTraThuaSo(int x) {
		while (x % 3 == 0) {
			x /= 3;
		}
		return x == 1;
	}

	public static void LietKe(int a[]) {
		int count = 0;
		for (int pt : a) {
			if (kiemTraThuaSo(pt)) {
				System.out.println(pt + "\t");
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Không có giá trị thỏa mãn!");
		}
	}
}
