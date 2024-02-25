import java.util.Scanner;

public class MainClass {

	final static int MIN = -1000;
	final static int MAX = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		float TBC = trungBinhCongLonHonX(a, scan);
		System.out.println("TBC: " + TBC);
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
	
	public static float trungBinhCongLonHonX(int a[], Scanner scan) {
		float TBC = 0;
		int tong = 0;
		int dem = 0;
		System.out.println("Nhập x: ");
		int x = Integer.parseInt(scan.nextLine());
		for (int pt : a) {
			if(pt>x) {
				tong+=pt;
				dem++;
			}
		}
		if(dem>0) {
			TBC = tong/dem;
		}
		return TBC;
	}
}
