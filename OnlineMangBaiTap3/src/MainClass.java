import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n, scan);
		xuatMang(a);
		lietKeChiSo(a);
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

	public static int timChoSoAmDauTien(int a[]) {
		int index = -1; // chưa tìm thấy
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				index = i; // đã tìm thấy phần tử âm tại chỉ số i
				break; // thoát khỏi vòng lặp vì đã tìm thấy phần tử âm đầu tiên
			}
		}
		return index;
	}

	public static void lietKeChiSo(int a[]) {
		int index = timChoSoAmDauTien(a);
		if (index == -1) {
			System.out.println("Mảng không có số âm");
		} else {
			System.out.println("Các vị trí tại đó có giá trị = " + a[index]);
			for (int i = index; i < a.length; i++) { // duyệt từ index là số âm đầu tiên
				if (a[i] == a[index]) {
					System.out.print((i + 1) + "\t");
				}
			}
		}
	}
}
