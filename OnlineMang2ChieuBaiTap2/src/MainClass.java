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
		inMax(a, soDong, soCot);
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
	
	public static void inMax(int a[][], int soDong, int soCot) {
		// Tìm max thật sự trong mảng
		int dongMax = 0;
		int cotMax = 0;
		int max = a[dongMax][cotMax];;
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				max = a[dongMax][cotMax];
				if(a[i][j]>max) {
					dongMax = i;
					cotMax = j;
				}
			}
		}
		// Quét lại mảng 2 chiều và in ra max
		System.out.println("Giá trị max = " + max + " tại các phần tử: ");
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if(a[i][j]==max) {
					System.out.print("(" + i + "," + j + ")");
				}
			}
		}
	}
}
