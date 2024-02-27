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
		giaTriGanXNhat(a, scan);
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

	public static void giaTriGanXNhat(int a[], Scanner scan) {
		System.out.println("Nhập x: "); 
		int x = Integer.parseInt(scan.nextLine());
		int b[] = new int [a.length];
		for(int i = 0; i < a.length;i++) {
			b[i] = Math.abs(x- a[i]);
		}
		xuatMang(b);
		int index = 0;
		for(int i = 0; i <b.length; i++) {
			if(b[i]<b[index]) {
				index = i;
			}
		}
		System.out.println("Các phần tử gần phần tử x = " + x + " là: ");
		for (int i = 0; i < b.length; i++) {
			if (b[i] == b[index]) {
				System.out.print("{" + i + ", " + a[i] + " }" +"\t");
			}
		}
	}
}
