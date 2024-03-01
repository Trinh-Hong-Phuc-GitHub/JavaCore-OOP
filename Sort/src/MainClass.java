import java.util.Scanner;

public class MainClass {

	final static int MIN = -30;
	final static int MAX = 30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		int m = nhapN(scan);
		int b[] = taoMang(m);
		xuatMang(b);
		a = interchangeSort(a);
		xuatMang(a);
		b = bubblechangeSort(b);
		xuatMang(b);
//		a = selectionSort(a);
//		xuatMang(a);
		int c[] = mergeSortedArrays(a, b);
		xuatMang(c);
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

	public static int[] interchangeSort(int a[]) {
		int i;
		int j;
		for (i = 0; i < a.length - 1; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	public static int[] bubblechangeSort(int b[]) {
		int i;
		int j;
		for (i = 0; i < b.length - 1; i++) {
			for (j = b.length - 1; j > i; j--) {
				if (b[j] < b[j - 1]) {
					int temp = b[j];
					b[j] = b[j - 1];
					b[j - 1] = temp;
				}
			}
		}
		return b;
	}
	
	public static int[] bubblechangeSort2(int b[]) {
		int i;
		int j;
		for (i = 0; i < b.length - 1; i++) {
			for (j = b.length - 1; j > i; j--) {
				if (b[j] > b[j - 1]) {
					int temp = b[j];
					b[j] = b[j - 1];
					b[j - 1] = temp;
				}
			}
		}
		return b;
	}
	
	public static int[] mergeSortedArrays(int[] a, int[] b) {
		a = bubblechangeSort2(a);
		b = bubblechangeSort2(b);
	    int[] result = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;

	    // So sánh và thêm phần tử vào mảng kết quả
	    while (i < a.length && j < b.length) {
	        if (a[i] >= b[j]) {
	            result[k++] = a[i++];
	        } else {
	            result[k++] = b[j++];
	        }
	    }

	    // Thêm các phần tử còn lại của mảng A
	    while (i < a.length) {
	        result[k++] = a[i++];
	    }

	    // Thêm các phần tử còn lại của mảng B
	    while (j < b.length) {
	        result[k++] = b[j++];
	    }

	    return result;
	}
}