import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n, scan);
		xuatMang(a);
		a = xoaPhanTuLonNhat(a);
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
		} System.out.println("\n");
	}

	public static int soLonNhat(int a[]) {
		int soLonNhat = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] > soLonNhat) {
				soLonNhat = a[i];
			}
		}
		return soLonNhat;
	}
	
	public static int demPhanTuLonNhat(int a[]) {
		int soLonNhat = soLonNhat(a);
		int dem = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == soLonNhat) {
				dem++;
			}
		}
		return dem;
	}
	
	public static int [] xoaPhanTuLonNhat(int a[]) {
		int dem = demPhanTuLonNhat(a);
		int soLonNhat = soLonNhat(a);
		int b[] = new int [a.length-dem];
		int j = 0;
		for(int i = 0; i <a.length; i++) {
			if(a[i] != soLonNhat) {
				b[j] = a[i];
				j++;
			}
		}
		a = b;
		return a;
 	}
}
