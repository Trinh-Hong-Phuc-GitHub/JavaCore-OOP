import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		doMenu(scan);
	}

	private static void inMenu() {
		System.out.println("Chọn chức năng: ");
		System.out.println("1. Nhập giao dịch");
		System.out.println("2. Tổng số lượng cho từng loại");
		System.out.println("3. Tính trung bình thành tiền cho giao dịch ngoại tệ");
		System.out.println("4. Xuất giao dịch có đơn giá hơn 1 tỷ");
		System.out.println("0. Thoát chương trình");
	}

	private static void doMenu(Scanner scan) {
		boolean flag = true;
		DanhSachGiaoDich xuLyGiaoDich = new DanhSachGiaoDich();
		xuLyGiaoDich.tinhTien();
		do {
			inMenu();
			System.out.println("Mời chọn: ");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				xuLyGiaoDich.nhap(scan);
				break;
			case 2:
				xuLyGiaoDich.tinhTongSLGDTienTe();
				xuLyGiaoDich.tinhTongSLGDVang();
				System.out.println("Tổng số lượng giao dịch tiền tệ: " + xuLyGiaoDich.getTongSLGDTienTe());
				System.out.println("Tổng số lượng giao dịch vàng: " + xuLyGiaoDich.getTongSLGDVang());
				break;
			case 3:
				xuLyGiaoDich.tinhTBThanhTienTT();
				System.out.println("Trung bình thành tiền giao dịch tiền tệ: " + xuLyGiaoDich.getTrungBinhThanhTienGDTT());
				break;
			case 4:
				xuLyGiaoDich.xuatGiaoDichTheoTieuChi();
				break;
			case 0:
				flag = false;
				break;

			}
		} while (flag);
	}
}
