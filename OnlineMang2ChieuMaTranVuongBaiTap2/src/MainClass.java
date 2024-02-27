import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[][] = nhapMang(n, scan);
		xuatMang(a, n);
		long tongChinh = tongPTTamGiacTrenDuongCheoChinh(a, n);
		long tongPhu = tongPTTamGiacTrenDuongCheoPhu(a, n);
		System.out.println("Tổng các phần tử trên đường chéo chính: " + tongChinh);
		System.out.println("Tổng các phần tử trên đường chéo phụ: " + tongPhu);

	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập vào giá trị > 1: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[][] nhapMang(int n, Scanner scan) {
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("a[" + i + "]" + "[" + j + "]");
				a[i][j] = Integer.parseInt(scan.nextLine());
			}
		}
		return a;
	}

	public static void xuatMang(int a[][], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\t");
		}
	}

	public static long tongPTTamGiacTrenDuongCheoChinh(int a[][], int n) {
		long tong = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				tong += a[i][j];
			}
		}
		return tong;
	}

	public static long tongPTTamGiacTrenDuongCheoPhu(int a[][], int n) {
		long tong = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				tong += a[i][j];
			}
		}
		return tong;
	}
}
