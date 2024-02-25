import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập họ tên: ");
		String hoTen = scan.nextLine();
		System.out.println("Nhập tổng thu nhập năm: ");
		float tongThuNhapNam = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập số người phụ thuộc: ");
		int soNguoiPhuThuoc = Integer.parseInt(scan.nextLine());
		float thuNhapChiuThue = tinhThuNhapChiuThue(tongThuNhapNam, soNguoiPhuThuoc);
		float thue = tinhThue(thuNhapChiuThue);
		System.out.println("Khách hàng " + hoTen + " phải đóng " + thue + " tiền thuế"); 
	}

	public static float tinhThuNhapChiuThue (float tongThuNhapNam, int soNguoiPhuThuoc) {
		float thuNhapChiuThue = tongThuNhapNam - 4 - soNguoiPhuThuoc*1.6f;
		return thuNhapChiuThue;
	}
	
	public static float thueDen60(float thuNhapChiuThue) {
		float thue;
		if (thuNhapChiuThue < 60) {
			thue = thuNhapChiuThue * 0.05f;
		} else {
			thue = 60 * 0.05f;
		}
		return thue;
	}

	public static float thue60Den120(float thuNhapChiuThue) {
		float thue;
		if (thuNhapChiuThue > 60 && thuNhapChiuThue < 120) {
			thue = thueDen60(thuNhapChiuThue) + (thuNhapChiuThue - 60) * 0.1f;
		} else {
			thue = thueDen60(thuNhapChiuThue) + 60 * 0.1f;
		}
		return thue;
	}

	public static float thue120Den216(float thuNhapChiuThue) {
		float thue;
		if (thuNhapChiuThue > 120 && thuNhapChiuThue < 216) {
			thue = thueDen60(thuNhapChiuThue) + thue60Den120(thuNhapChiuThue) + (thuNhapChiuThue - 120) * 0.15f;
		} else {
			thue = thueDen60(thuNhapChiuThue) + thue60Den120(thuNhapChiuThue) + 96 * 0.15f;
		}
		return thue;
	}

	public static float thue216Den384(float thuNhapChiuThue) {
		float thue;
		if (thuNhapChiuThue > 216 && thuNhapChiuThue < 384) {
			thue = thueDen60(thuNhapChiuThue) + thue60Den120(thuNhapChiuThue) + thue120Den216(thuNhapChiuThue)
					+ (thuNhapChiuThue - 210) * 0.2f;
		} else {
			thue = thueDen60(thuNhapChiuThue) + thue60Den120(thuNhapChiuThue) + thue120Den216(thuNhapChiuThue)
					+ 168 * 0.2f;
		}
		return thue;
	}

	public static float thue384Den624(float thuNhapChiuThue) {
		float thue;
		if (thuNhapChiuThue > 384 && thuNhapChiuThue < 624) {
			thue = thueDen60(thuNhapChiuThue) + thue60Den120(thuNhapChiuThue) + thue120Den216(thuNhapChiuThue)
					+ thue216Den384(thuNhapChiuThue) + (thuNhapChiuThue - 384) * 0.25f;
		} else {
			thue = thueDen60(thuNhapChiuThue) + thue60Den120(thuNhapChiuThue) + thue120Den216(thuNhapChiuThue)
					+ thue216Den384(thuNhapChiuThue) + 240 * 0.25f;
		}
		return thue;
	}

	public static float thue624Den960(float thuNhapChiuThue) {
		float thue;
		if (thuNhapChiuThue > 624 && thuNhapChiuThue < 960) {
			thue = thueDen60(thuNhapChiuThue) + thue60Den120(thuNhapChiuThue) + thue120Den216(thuNhapChiuThue)
					+ thue216Den384(thuNhapChiuThue) + thue384Den624(thuNhapChiuThue) + (thuNhapChiuThue - 624) * 0.3f;
		} else {
			thue = thueDen60(thuNhapChiuThue) + thue60Den120(thuNhapChiuThue) + thue120Den216(thuNhapChiuThue)
					+ thue216Den384(thuNhapChiuThue) + thue384Den624(thuNhapChiuThue) + 336 * 0.3f
					+ (thuNhapChiuThue - 960) * 0.35f;
		}
		return thue;
	}

	public static float tinhThue(float thuNhapChiuThue) {
		float thue;
		if (thuNhapChiuThue <= 60) {
			thue = thueDen60(thuNhapChiuThue);
		} else if (thuNhapChiuThue > 60 && thuNhapChiuThue <= 120) {
			thue = thue60Den120(thuNhapChiuThue);
		} else if (thuNhapChiuThue > 120 && thuNhapChiuThue <= 216) {
			thue = thue120Den216(thuNhapChiuThue);
		} else if (thuNhapChiuThue > 216 && thuNhapChiuThue <= 384) {
			thue = thue216Den384(thuNhapChiuThue);
		} else if (thuNhapChiuThue > 384 && thuNhapChiuThue <= 624) {
			thue = thue384Den624(thuNhapChiuThue);
		} else if (thuNhapChiuThue > 624 && thuNhapChiuThue <= 960) {
			thue = thue384Den624(thuNhapChiuThue);
		} else {
			thue = thue624Den960(thuNhapChiuThue);
		}
		return thue;
	}
}
