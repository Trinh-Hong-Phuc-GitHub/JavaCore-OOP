import java.util.Scanner;

public class MainClass {

	final static int MIN = -10;
	final static int MAX = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int soDong = nhapN(scan);
		int soCot = nhapN(scan);
		int a[][] = taoMang(soDong, soCot, scan);
		int b[][] = taoMang(soDong, soCot, scan);
		xuatMang(a, soDong, soCot);
		System.out.println("\n");
		xuatMang(b, soDong, soCot);
		int c[][] = tongMaTran(a, b, soDong, soCot);
		System.out.println("\n");
		xuatMang(c, soDong, soCot);
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập vào giá trị > 1: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[][] taoMang(int soDong, int soCot, Scanner scan) {
		int a[][] = new int[soDong][soCot];
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				a[i][j] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
			}
		}
		return a;
	}

	public static void xuatMang(int a[][], int soDong, int soCot) {
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\t");
		}
	}

	public static int [][] tongMaTran(int a[][], int b[][], int soDong, int soCot) {
		int c[][] = new int [soDong][soCot];
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
}
