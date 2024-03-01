import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachNhanSu {

	private ArrayList<NhanSu> listNhanSu;

	public ArrayList<NhanSu> getListNhanSu() {
		return listNhanSu;
	}

	public void setListNhanSu(ArrayList<NhanSu> listNhanSu) {
		this.listNhanSu = listNhanSu;
	}

	public DanhSachNhanSu() {
		// TODO Auto-generated constructor stub
		this.listNhanSu = new ArrayList<NhanSu>();
	}

	private void inMenu() {
		System.out.println("1. Nhập nhân viên thường ");
		System.out.println("2. Nhập trưởng phòng");
		System.out.println("3. Nhập giám đốc");
		System.out.println("0. Thoát");
	}

	public ArrayList<NhanVienThuong> nhap(Scanner scan) {
		boolean flag = true;
		ArrayList<NhanVienThuong> listNhanVienThuongMoi = new ArrayList<NhanVienThuong>();
		NhanSu nhanSu = null;
		do {
			inMenu();
			System.out.println("Mời chọn");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				nhanSu = new NhanVienThuong();
				nhanSu.nhap(scan);
				nhanSu.tinhLuong();
				this.them(nhanSu);
				this.listNhanSu.add((NhanVienThuong) nhanSu);
				break;
			case 2:
				nhanSu = new TruongPhong();
				nhanSu.nhap(scan);
				nhanSu.tinhLuong();
				this.them(nhanSu);
				break;
			case 3:
				nhanSu = new GiamDoc();
				nhanSu.nhap(scan);
				nhanSu.tinhLuong();
				this.them(nhanSu);
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Nhập từ 0 đến 3!");
			}
		} while (flag);
		return listNhanVienThuongMoi;
	}
	
	public void xuat() {
		for(NhanSu ns: this.listNhanSu) {
			ns.xuat();
		}
	}
	
	public void tinhLuong() {
		for(NhanSu ns: this.listNhanSu) {
			ns.tinhLuong();
		}
	}
	
	public void them(NhanSu ns) {
		this.listNhanSu.add(ns);
	}
}
