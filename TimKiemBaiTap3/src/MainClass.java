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
		viTriGiaTriDuongNhoNhat(a);
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

	public static void viTriGiaTriDuongNhoNhat(int a[]) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				index = i;
				break;
			}
		}
		if(index!=-1) {
			for (int i = index + 1; i < a.length; i++) {
				if (a[i] > 0 && a[i] < a[index]) {
					index = i;
				}
			}
			System.out.println("Các vị trí có giá trị dương nhỏ nhất = " + a[index]);
			for (int i = index; i < a.length; i++) {
				if (a[i] == a[index]) {
					System.out.print(i + "\t");
				}
			}
		} else {
			System.out.println("Mảng không có giá trị dương!");
		}
	}
}
