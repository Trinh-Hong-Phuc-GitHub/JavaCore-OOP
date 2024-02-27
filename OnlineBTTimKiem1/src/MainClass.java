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
		int index = timPhanTuDuongDauTien(a);
		if(index!=-1) {
			System.out.println("Tìm thấy phần tử dương đầu tiền " + a[index] + " tại " + index);
		} else {
			System.out.println("Mảng không có phần tử dương");
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
	
	public static int timPhanTuDuongDauTien(int a[]) {
		for(int i = 0; i < a.length; i ++) {
			if(a[i] > 0) {
				return i;
			}
		}
		return -1;
	}
}
