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
		float TBC = trungBinhCongSoNguyenTo(a);
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

	public static float trungBinhCongSoNguyenTo(int a[]) {
		int tong = 0;
		int dem = 0;
		float trungBinhCong = 0;
		for (int i = 0; i < a.length; i++) {
			boolean flag = true;
			if(a[i] <=1) {
				flag = false;
			}
			for (int j = 2; j < Math.sqrt(a[i]); j++) {
				if (a[i] % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				tong+=a[i];
				dem++;
			}
		}
		if(dem!=0) {
			trungBinhCong = tong/dem;
		}
		return trungBinhCong;
	}

	
}
