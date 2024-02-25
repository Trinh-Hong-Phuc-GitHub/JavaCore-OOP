import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập vào số phần tử n = ");
		int n = Integer.parseInt(scan.nextLine());
		int a[] = nhapMang(n, scan);
		xuatMang(a);
		System.out.println("\n");
		xuatMangForEach(a);
	}

	public static int[] nhapMang(int n, Scanner scan) {
		int a[] = new int[n];
		System.out.println("Nhập mảng 1 chiều: ");
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		System.out.println("Xuất mảng cách 1: ");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i] + "\t");
		}
	}
	
	public static void xuatMangForEach(int a[]) {
		System.out.println("Xuất mảng cách 2: ");
		for(int item: a) {
			System.out.print(item + "\t");
		}
	}
}
