import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n, scan);
		xuatMang(a);
		System.out.println("\n");
		System.out.println("Nhập x: ");
		int x = Integer.parseInt(scan.nextLine());
		a = xoaTatCaPhanTuGiaTriX(a, x);
		xuatMang(a);
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập n > 0 ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[] taoMang(int n, Scanner scan) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
	}
	
	public static int demPhanTu(int a[], int x) {
		int dem = 0;
		for(int pt :a ) {
			if(pt == x) {
				dem++;
			}
		}
		return dem;
	}
	
	public static int[] xoaTatCaPhanTuGiaTriX(int a[], int x) {
		int dem = demPhanTu(a, x);
		if(dem>0) {
			int b[] = new int [a.length-dem];
			int j = 0;
			for(int i = 0; i < a.length; i++) {
				if(a[i] !=x) {
					b[j] = a[i];
					j++;
				}
			}
			a = b;
		} else {
			System.out.println("Không có phần tử x trong mảng");
		}
		return a;
	}
}
