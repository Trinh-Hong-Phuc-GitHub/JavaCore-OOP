import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n, scan);
		xuatMang(a);
		System.out.println("\n");
		lietKeSoAmNhoNhat(a);
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

	public static void lietKeSoAmNhoNhat(int a[]) {
		// tim số âm đầu tiên trong mảng
		int indexMin = -1;
		for(int i = 0; i < a.length; i++) {
			if(a[i] < 0) {
				indexMin = i;
				break;
			} 
		}
		// Tìm phần tử âm nhỏ nhất thực sự
		if(indexMin!=-1) {
			for(int i = indexMin + 1; i < a.length; i++) {
				if(a[i] < 0 && a[i]< a[indexMin]) {
					indexMin = i;
				} 
			}
			System.out.println("Các phần tử âm nhỏ nhất là " + a[indexMin] + " xuất hiên tại các vị trí: ");
			for(int i = indexMin; i < a.length; i++) {
				if(a[i] == a[indexMin]) {
					System.out.print(i + "\t");
				} 
			}
		} else {
			System.out.println("Mảng không có phần tử âm");
		}
	}
}
