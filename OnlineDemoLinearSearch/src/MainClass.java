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
		boolean found = linearSearch(a, x);
//		if (found) {
//			System.out.println("Tìm thấy x = " + x + " trong mảng");
//		} else {
//			System.out.println("Không tìm thấy");
//		}
		int index = linearSearch1(a, x);
		if (index != -1) {
			System.out.println("Tìm thấy x tại vị trí " + index + " trong mảng");
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

	public static boolean linearSearch(int a[], int x) {
		int i = 0;
		while (i < a.length && a[i]!=x) {
			i++;
		}
		if(i==a.length) {
			return false;
		} else {
			return true;
		}
	}
	
	public static int linearSearch1(int a[], int x) {
		for(int i = 0; i < a.length; i++) {
			if(a[i]==x) {
				return i;
			}
		}
		return -1; 
	}
	
	public static int linearSearch2(int a[], int x) {
		int index = -1;
		for(int i = 0; i < a.length; i++) {
			if(a[i]==x) {
				index = i;
			}
		}
		return index; 
	}
}
