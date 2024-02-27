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
		int index = timGiaTriDauNamTrongDoanXY(a, scan);
		if(index!= -1) {
			System.out.println("Giá trị đầu: " + a[index]);
		} else {
			System.out.println("Không tồn tại");
		}
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

	public static int timGiaTriDauNamTrongDoanXY(int a[], Scanner scan) {
		int index = -1;
		System.out.println("Nhập x: ");
		int x = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập y: ");
		int y = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < a.length; i++) {
			if(a[i] > x && a[i]<y) {
				index = i;
				break;
			}
		}
		return index;
	}
}

