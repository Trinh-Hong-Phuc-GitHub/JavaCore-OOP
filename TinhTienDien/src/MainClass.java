import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String ten = nhapTen(scan);
		int dien = nhapKWĐ(scan);
		int tien = tinhTienDien(dien);
		System.out.println("Khách hàng " + ten + " có số tiền phải trả là: " + tien);
	}

	public static String nhapTen(Scanner scan) {
		String ten;
		System.out.println("Bạn vui lòng nhập vào tên: ");
		ten = scan.nextLine();
		return ten;
	}

	public static int nhapKWĐ(Scanner scan) {
		int dien;
		System.out.println("Nhập vào số KWĐ: ");
		dien = Integer.parseInt(scan.nextLine());
		return dien;
	}

	public static int tinhTien50KWDDau(int dien) {
		int tien;
		if (dien < 50) {
			tien = dien * 500;
		} else {
			tien = 50 * 500;
		}
		return tien;
	}

	public static int tinhTien50KWĐKe(int dien) {
		int tien;
		if (dien > 50 && dien < 100) {
			tien = tinhTien50KWDDau(dien) + (dien - 50) * 650;
		} else {
			tien = 50 * 650 + tinhTien50KWDDau(dien);
		}
		return tien;
	}

	public static int tinhTien100KWĐKe(int dien) {
		int tien;
		if (dien > 100 && dien < 200) {
			tien = tinhTien50KWDDau(dien) + tinhTien50KWĐKe(dien) + (dien - 100) * 850;
		} else {
			tien = tinhTien50KWDDau(dien) + tinhTien50KWĐKe(dien) + 100 * 850;
		}
		return tien;
	}

	public static int tinhTien150KWĐKe(int dien) {
		int tien;
		if (dien > 200 && dien < 350) {
			tien = tinhTien50KWDDau(dien) + tinhTien50KWĐKe(dien) + tinhTien100KWĐKe(dien) + (dien - 200) * 1100;
		} else {
			tien = tinhTien50KWDDau(dien) + tinhTien50KWĐKe(dien) + tinhTien100KWĐKe(dien) + 150 * 1100
					+ (dien - 350) * 1300;
		}
		return tien;
	}

	public static int tinhTienDien(int dien) {
		int tien;
		if (dien <= 50) {
			tien = tinhTien50KWDDau(dien);
		} else if (dien > 50 && dien <= 100) {
			tien = tinhTien50KWĐKe(dien);
		} else if (dien > 100 && dien <= 200) {
			tien = tinhTien100KWĐKe(dien);
		} else {
			tien = tinhTien100KWĐKe(dien);
		}
		return tien;
	}
}
