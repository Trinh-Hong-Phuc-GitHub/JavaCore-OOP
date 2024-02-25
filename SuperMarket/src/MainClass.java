import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		final int QUOTE_1 = 100;
		final int QUOTE_2 = 50;
		final float GIFT_QUOTE_1 = 0.88f;
		final float GIFT_QUOTE_2 = 0.92f;
		Scanner scan = new Scanner(System.in);
		String tenHang;
		int soLuong;
		float donGia;
		float thanhTien;
		System.out.print("Vui lòng nhập tên hàng: ");
		tenHang = scan.nextLine();
		System.out.print("Vui lòng nhập số lượng: ");
		soLuong = Integer.parseInt(scan.nextLine());
		System.out.print("Vui lòng nhập đơn giá: ");
		donGia = Float.parseFloat(scan.nextLine());
		if (soLuong > QUOTE_1) {
			thanhTien = QUOTE_1 * donGia + (soLuong - 100) * donGia * GIFT_QUOTE_1;
		} else if ((soLuong > QUOTE_2) && (soLuong < QUOTE_1)) {
			thanhTien = QUOTE_2 * donGia + (soLuong - QUOTE_2) * donGia * GIFT_QUOTE_2;
		} else {
			thanhTien = soLuong * donGia;
		}
		System.out.println("Tên: " + tenHang + "\t" + "Số lượng: " + soLuong + "\t" + "Đơn giá: " + "\t" + donGia + "\t"
				+ "Thành tiền: " + thanhTien);
	}

}
