import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n, scan);
		xuatMang(a);
		System.out.println("\n");
		lietKe(a);
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

	public static int timSoDuongDauTien(int a[]) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static int timSoDuongNhoNhat(int a[]) {
		int indexDuong = timSoDuongDauTien(a);
		int indexMin = -1;
		if (indexDuong == -1) {
			System.out.println("Mảng không có phần tử dương");
		} else {
			indexMin = indexDuong;
			for (int i = indexDuong + 1; i < a.length; i++) {
				if (a[i] > 0 && a[i] < a[indexMin]) {
					indexMin = i;
				}
			}
		}
		return indexMin;
	}

	public static void lietKe(int a[]) {
		int indexMin = timSoDuongNhoNhat(a);
		if (indexMin == -1) {
			System.out.println("Mảng không có số dương nào!");
		} else {
			System.out.println("Các số dương bằng với số dương đầu tiên nhỏ nhất là: ");
			for (int i = indexMin + 1; i < a.length; i++) {
				if (a[i] == a[indexMin]) {
					System.out.print(i + "\t");
				}
			}
		}
	}
}
