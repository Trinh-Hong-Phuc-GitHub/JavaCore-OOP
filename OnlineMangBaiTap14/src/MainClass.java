import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n, scan);
		xuatMang(a);
		boolean doiXung = kiemTraDoiXung(a);
		if (doiXung) {
			System.out.println("Mảng đối xứng!");
		} else {
			System.out.println("Mảng không đối xứng!");
		}
		xoayTrai(a, scan);
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
		System.out.println("\n");
	}

	public static boolean kiemTraDoiXung(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != a[a.length - i - 1]) {
				return false;
			}
		}
		return true;
	}
	
	public static int [] xoayTrai(int a[], Scanner scan) {
		int k;
		int tam;
		do {
			System.out.println("Vui lòng nhập k > 0");
			k = Integer.parseInt(scan.nextLine());
		} while(k<0);
		k %= a.length;
		for(int i =0; i < k; i++) {
			// tạo biến tạm để lưu trữ a[0]
			tam = a[0];
			// Duyệt và chép đè phần tử a[i+1] lên a[i]
			for(int j = 0; j < a.length-1;j++) {
				a[j] = a[j+1];
			}
			a[a.length-1] = tam;
		}
		return a;
	}
}
 