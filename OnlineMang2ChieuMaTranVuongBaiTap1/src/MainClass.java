import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[][] = nhapMang(n, scan);
		xuatMang(a, n);
		boolean doiXung = laDoiXung(a, n);
		if(doiXung) {
			System.out.println("Là đối xứng");
		} else {
			System.out.println("Không đối xứng");
		}
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

	public static boolean laDoiXung(int a[][], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] != a[j][i]) {
					return false;
				}
			}
		}
		return true;
	}
}
