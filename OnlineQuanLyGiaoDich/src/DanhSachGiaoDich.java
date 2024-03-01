import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachGiaoDich {
	
	final int MOT_TY = 1000;
	private ArrayList<GiaoDich> listGiaoDich;
	private int tongSLGDVang;
	private int tongSLGDTienTe;
	private float trungBinhThanhTienGDTT;

	public float getTrungBinhThanhTienGDTT() {
		return trungBinhThanhTienGDTT;
	}

	public ArrayList<GiaoDich> getListGiaoDich() {
		return listGiaoDich;
	}

	public void setListGiaoDich(ArrayList<GiaoDich> listGiaoDich) {
		this.listGiaoDich = listGiaoDich;
	}

	public int getTongSLGDVang() {
		return tongSLGDVang;
	}

	public void setTongSLGDVang(int tongSLGDVang) {
		this.tongSLGDVang = tongSLGDVang;
	}

	public int getTongSLGDTienTe() {
		return tongSLGDTienTe;
	}

	public void setTongSLGDTienTe(int tongSLGDTienTe) {
		this.tongSLGDTienTe = tongSLGDTienTe;
	}

	public DanhSachGiaoDich() {
		// TODO Auto-generated constructor stub
		listGiaoDich = new ArrayList<GiaoDich>();
	}

	public DanhSachGiaoDich(ArrayList<GiaoDich> listGiaoDich) {
		this.listGiaoDich = listGiaoDich;
	}

	public void nhap(Scanner scan) {
		boolean flag = true;
		GiaoDich giaoDich;
		do {
			System.out.println("Vui lòng chọn: ");
			System.out.println("1. Nhập giao dịch vàng");
			System.out.println("2. Nhập giao dịch tiền tệ");
			System.out.println("3. Nhập 0 để thoát");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				giaoDich = new GiaoDichVang();
				giaoDich.nhap(scan);
				giaoDich.tinhTien();
				listGiaoDich.add(giaoDich);
				break;
			case 2:
				giaoDich = new GiaoDichTienTe();
				giaoDich.nhap(scan);
				giaoDich.tinhTien();
				listGiaoDich.add(giaoDich);
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Vui lòng nhập 0,1,2");
			}
		} while (flag);
	}

	public void xuat() {
		for (GiaoDich gd : this.listGiaoDich) {
			gd.xuat();
		}
	}

	public void tinhTien() {
		for (GiaoDich gd : this.listGiaoDich) {
			gd.tinhTien();
		}
	}
	
	public void tinhTongSLGDVang() {
		this.tongSLGDVang = 0;
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd instanceof GiaoDichVang) {
				this.tongSLGDVang += gd.soLuong;
			}
		}
	}

	public void tinhTongSLGDTienTe() {
		this.tongSLGDTienTe = 0;
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd instanceof GiaoDichTienTe) {
				this.tongSLGDTienTe += gd.soLuong;
			}
		}
	}

	public void tinhTBThanhTienTT() {
		float thanhTien = 0;
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd instanceof GiaoDichTienTe) {
				thanhTien += ((GiaoDichTienTe) gd).getThanhTien();
			}
		}
		this.trungBinhThanhTienGDTT = thanhTien / this.tongSLGDTienTe;
	}
	
	public void xuatGiaoDichTheoTieuChi() {
		System.out.println("Các giao dịch có đơn giá lớn hơn " + MOT_TY);
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd.getDonGia() > MOT_TY) {
				gd.xuat();
			}
		}
	}
}
