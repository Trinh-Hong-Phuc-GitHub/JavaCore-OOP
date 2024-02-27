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
		soNguyenToLonHonMaxMang(a);
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

	public static int timMaxMang(int a[]) {
		int indexMax = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[indexMax]) {
				indexMax = i;
			}
		}
		System.out.println("Max: " + a[indexMax]);
		return a[indexMax];
	}
	
	public static void soNguyenToLonHonMaxMang(int a[]) {
		int index = timMaxMang(a);
		int soNguyenTo = index + 1;
		while (true) {
	        boolean flag = true;
	        if (soNguyenTo <= 1) {
	            flag = false;
	        }
	        for (int j = 2; j <= Math.sqrt(soNguyenTo); j++) {
	            if (soNguyenTo % j == 0) {
	                flag = false;
	                break;
	            }
	        }
	        if (flag) {
	            break; // Nếu là số nguyên tố, thoát vòng lặp
	        }
	        soNguyenTo++; // Tăng lên kiểm tra số tiếp theo
	    }
	    System.out.println("Số nguyên tố nhỏ nhất lớn hơn mọi giá trị trong mảng: " + soNguyenTo);
	}
}
