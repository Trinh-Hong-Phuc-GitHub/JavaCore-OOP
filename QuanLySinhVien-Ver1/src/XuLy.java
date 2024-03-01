import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// DanhSachSinhVien ds = new DanhSachSinhVien();
		TruongHoc truong = new TruongHoc();
		truong.nhap();
		doMenu(truong);
	}

	private static void inMenu() {
		System.out.println("Vui lòng chọn thực hiện: ");
		System.out.println("1. Thêm sinh viên");
		System.out.println("2. Xuất danh sách sinh viên");
		System.out.println("3. Liệt kê danh sách sinh viên có điểm trung bình cao nhất");
		System.out.println("4. Liệt kê danh sách sinh viên xếp loại yếu");
		System.out.println("5. Tìm kiếm sinh viên theo tên");
		System.out.println("6. Tìm kiếm sinh viên theo mã");
		System.out.println("7. Xóa sinh viên theo mã");
		System.out.println("0. Thoát");
	}

	private static void doMenu(TruongHoc truong) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		do {
			inMenu();
			System.out.println("Mời chọn: ");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				SinhVien sv = new SinhVien();
				sv.nhap(scan);
				truong.themSinhVien(sv);
				break;
			case 2:
				truong.tinhDiemTB();
				truong.xepLoai();
				truong.xuatTheoFormat(truong.getDssvToanTruong().getListSV());
				break;
			case 3:
				ArrayList<SinhVien> list = truong.timDanhSachSVDTBCaoNhat();
				truong.xuatTheoFormat(list);
				break;
			case 4:
				ArrayList<SinhVien> listYeu = truong.lietKeDSSVYeu();
				truong.xuatTheoFormat(listYeu);
				break;
			case 5:
				System.out.println("Nhập tên cần tìm: ");
				String tenSV = scan.nextLine();
				ArrayList<SinhVien> listTen = truong.timKiemTheoTen(tenSV);
				truong.xuatTheoFormat(listTen);
				break;
			case 6:
				System.out.println("Nhập mã cần tìm: ");
				int maSV = Integer.parseInt(scan.nextLine());
				SinhVien svFound = truong.timKiemTheoMa(maSV);
				if (svFound != null) {
					svFound.xuat();
				} else {
					System.out.println("Không có sinh viên có mã: " + maSV);
				}
				break;
			case 7:
				System.out.println("Nhập mã cần tìm: ");
				int maCanXoa = Integer.parseInt(scan.nextLine());
				boolean deleted = truong.xoaSinhVienTheoMa(maCanXoa);
				if(deleted) {
					System.out.println("Xóa thành công");
				} else {
					System.out.println("Chưa được xóa hoặc sinh viên không có trong danh sách");
				}
				break;
			case 0:
				flag = false;
				break;
			}
		} while (flag);
	}
}
