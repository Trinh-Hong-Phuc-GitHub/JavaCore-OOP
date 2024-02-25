import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập số phần tử của n = ");
		int n = Integer.parseInt(scan.nextLine());
		int a[] = nhapMang(n, scan);
		xuatMangForI(a);
		float tongChan = tinhTongChan(a);
		System.out.println("Tổng chẵn: " + tongChan);
		int demSoAm = demSoAm(a);
		System.out.println("Số số âm: " + demSoAm);
		float tongAm = tongSoAm(a);
		System.out.println("Tổng số âm: " + tongAm);
	}

	public static int[] nhapMang(int n, Scanner scan) {
		int a[] = new int[n];
		System.out.println("Nhập mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}

	public static void xuatMangForI(int a[]) {
		System.out.println("Xuất mảng");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	public static void xuaMangForEach(int a[]) {
		System.out.println("Xuất mảng");
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
	}

	public static float tinhTongChan(int a[]) {
		float tong = 0;
		for (int pt : a) {
			if (pt % 2 == 0) {
				tong += pt;
			}
		}
		return tong;
	}

	public static float tinhTongChanbangFor(int a[]) {
		float tong = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				tong += a[i];
			}
		}
		return tong;
	}

	public static int demSoAm(int a[]) {
		int dem = 0;
		for (int pt : a) {
			if (pt < 0) {
				dem += 1;
			}
		}
		return dem;
	}

	public static int demSoAmBangFor(int a[]) {
		int dem = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				dem += 1;
			}
		}
		return dem;
	}

	public static float tongSoAm(int a[]) {
		float tong = 0;
		for (int pt : a) {
			if (pt < 0) {
				tong += pt;
			}
		}
		return tong;
	}

	public static float tongSoAmBangFor(int a[]) {
		float tong = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				tong += a[i];
			}
		}
		return tong;
	}
}
