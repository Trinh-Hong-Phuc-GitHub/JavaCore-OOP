import java.util.Scanner;

public class MainClass {

	final static int MIN = -50;
	final static int MAX = 50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int soDong = nhapN(scan);
		int soCot = nhapN(scan);
		int a[][] = taoMang(soDong, soCot, scan);
		xuatMang(a, soDong, soCot);
		lietKeDongChuaPhanTuChan(a, soDong, soCot);
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

	public static void lietKeDongChuaPhanTuChan(int a[][], int soDong, int soCot) {
		boolean flag;
		for (int i = 0; i < soDong; i++) {
			flag = false;
			for (int j = 0; j < soCot; j++) {
				if (a[i][j] % 2 == 0) {
					flag = true;
					break;
				}
			}
			if(flag) {
				System.out.println("Dòng " + i + " có chứa phần tử chẵn");
			}
		}
	}
}
