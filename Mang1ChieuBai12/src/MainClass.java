import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n, scan);
		xuatMang(a);
		a = xoaPhanTuAm(a);
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
	
	public static int demPhanTuAm(int a[]) {
		int dem = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] < 0) {
				dem++;
			}
		}
		return dem;
	}
	
	public static int [] xoaPhanTuAm(int a[]) {
		int dem = demPhanTuAm(a);
		int b[] = new int [a.length-dem];
		int j = 0;
		for(int i = 0; i <a.length; i++) {
			if(a[i] > 0) {
				b[j] = a[i];
				j++;
			}
		}
		a = b;
		return a;
 	}
}
