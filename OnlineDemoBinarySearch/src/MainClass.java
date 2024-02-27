import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n, scan);
		xuatMang(a);
		System.out.println("Nhập giá trị cần tìm x: ");
		int x = Integer.parseInt(scan.nextLine());
//		boolean found = binarySearch(a, x);
//		if (found) {
//			System.out.println("Tìm thấy x = " + x + " trong mảng");
//		} else {
//			System.out.println("Không tìm thấy");
//		}
		int index = binarySearch1(a, x);
		if (index!=-1) {
			System.out.println("Tìm thấy x tại vị trí" + index + " trong mảng");
		} else {
			System.out.println("Không tìm thấy");
		}
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập số phần tử của mảng:");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[] taoMang(int n, Scanner scan) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = ");
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

	public static boolean binarySearch(int a[], int x) {
		int left = 0;
		int right = a.length - 1;
		int mid;
		do {
			mid = (left + right) / 2;
			if (a[mid] == x) {
				return true;
			} else if (a[mid] < x) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		} while (left <= right);
		return false;
	}
	
	public static int binarySearch1(int a[], int x) {
		int left = 0;
		int right = a.length - 1;
		int mid;
		do {
			mid = (left + right) / 2;
			if (a[mid] == x) {
				return mid;
			} else if (a[mid] < x) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		} while (left <= right);
		return -1;
	}
}
