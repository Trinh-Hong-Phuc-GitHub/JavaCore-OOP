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
		int index = soChanCuoiCung(a);
		if (index!=-1) {
			System.out.println("Tìm thấy số chẵn cuối cùng " + a[index] + " tại " + index);
		} else {
			System.out.println("Mảng không có số chẵn");
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

	public static int soChanCuoiCung(int a[]) {
		int index = -1;
		for (int i = a.length - 1; i > 0; i--) {
			if (a[i] % 2 == 0) {
				index = i;
				break;
			}
		}
		return index;

	}
}
