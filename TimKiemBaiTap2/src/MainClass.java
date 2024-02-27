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
		int index = viTriChanDauTien(a);
		if(index!=-1) {
			System.out.println("Số chẵn đầu: " + a[index]);
		} else {
			System.out.println("Không có số chẵn");
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

	public static int viTriChanDauTien(int a[]) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				index = i;
				break;
			}
		}
		return index;
	}
}
