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
//		a = interchangeSort(a);
//		xuatMang(a);
//		a = bubblechangeSort(a);
//		xuatMang(a);
		a = selectionSort(a);
		xuatMang(a);
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
					int tam = a[i];
					a[i] = a[j];
					a[j] = tam;
				}
			}
		}
		return a;
	}

	public static int[] bubblechangeSort(int a[]) {
		int i;
		int j;
		for (i = 0; i < a.length - 1; i++) {
			for (j = a.length - 1; j > i; j--) {
				if (a[j] < a[j - 1]) {
					int tam = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tam;
				}
			}
		}
		return a;
	}

	public static int timViTriMin(int a[], int k) {
		int vtMin = k;
		for (int i = k + 1; i < a.length; i++) {
			if (a[i] < a[vtMin]) {
				vtMin = i;
			}
		}
		return vtMin;
	}

	public static int[] selectionSort(int a[]) {
		int vtMin;
		for (int i = 0; i < a.length-1; i++) {
			vtMin = timViTriMin(a, i);
			int temp = a[i];
			a[i] = a[vtMin];
			a[vtMin] = temp;
		}
		return a;
	}
}