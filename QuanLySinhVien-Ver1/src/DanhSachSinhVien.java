
/*
 * Mục đích: Tạo ra để quản lý ds nhiều sv
 * Ng tạo: Trịnh Hồng Phúc
 * Ngay tạo: 29/03/2024
 * version: 1.0
 * */
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {

	private ArrayList<SinhVien> listSV;

	public ArrayList<SinhVien> getListSV() {
		return listSV;
	}

	public void setListSV(ArrayList<SinhVien> listSV) {
		this.listSV = listSV;
	}

	public DanhSachSinhVien() {
		// TODO Auto-generated constructor stub
		this.listSV = new ArrayList<SinhVien>();
	}

	public DanhSachSinhVien(ArrayList<SinhVien> listSV) {
		super();
		this.listSV = listSV;
	}

	// Dùng để khởi động list và các giá trị mặc định cho lớp
	private void thietLapDefault() {
		this.listSV = new ArrayList<SinhVien>();

	}

	public void nhap(Scanner scan) {
		for (SinhVien sv : this.listSV) {
			sv.nhap(scan);
		}
	}

	public void themSinhVien(SinhVien sv) {
		listSV.add(sv);
	}

	public void xuat() {
		for (SinhVien sv : this.listSV) {
			sv.xuat();
		}
	}

	public void tinhDiemTB() {
		for (SinhVien sv : this.listSV) {
			sv.tinhDiemTB();
		}
	}

	public void xepLoai() {
		for (SinhVien sv : this.listSV) {
			sv.xepLoai();
		}
	}

	public ArrayList<SinhVien> timDanhSachSVDTBCaoNhat() {
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		if (this.listSV.size() > 0) {
			SinhVien svMax = this.listSV.get(0);
			for (SinhVien svCurrent : listSV) {
				if (svCurrent.getDiemTB() > svMax.getDiemTB()) {
					svMax = svCurrent;
				}
			}
			for (SinhVien svCurrent : this.listSV) {
				if (svCurrent.getDiemTB() == svMax.getDiemTB()) {
					list.add(svCurrent);
				}
			}
		}
		return list;
	}
	
	public ArrayList<SinhVien> timDanhSachSVDTBCaoNhatToiUu() {
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		if (this.listSV.size() > 0) {
			SinhVien svMax = this.listSV.get(0);
			int viTriMaxDauTien = 0;
			for (int i = 0; i < this.listSV.size();i++) {
				SinhVien svCurrent = this.listSV.get(i);
				if (svCurrent.getDiemTB() > svMax.getDiemTB()) {
					svMax = svCurrent;
					viTriMaxDauTien = i;
				}
			}
			list.add(svMax);
			for (int i = viTriMaxDauTien + 1; i < this.listSV.size();i++) {
				SinhVien svCurrent = this.listSV.get(i);
				if (svCurrent.getDiemTB() == svMax.getDiemTB()) {
					list.add(svCurrent);
				}
			}
		}
		return list;
	}
	
	public ArrayList<SinhVien> lietKeDSSVYeu(){
		ArrayList<SinhVien> listYeu = new ArrayList<SinhVien>();
		for(SinhVien sv: this.listSV) {
			if(sv.getDiemTB()<5) {
				listYeu.add(sv);
			}
		}
		return listYeu;
	}
	
	public ArrayList<SinhVien> timKiemTheoTen(String tenSV){
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		for(SinhVien sv: this.listSV) {
			if(sv.getTenSV().equals(tenSV)) {
				list.add(sv);
			}
		}
		return list;
	}
	
	public SinhVien timKiemTheoMa(int maSV) {
		SinhVien sv = null;
		for(SinhVien sv1: this.listSV) {
			if(sv1.getMaSV() == maSV) {
				sv = sv1;
				break;
			}
		}
		return sv;
	}
	
	public boolean xoaSVTheoMa(int maSV) {
		boolean delete = false;
		for(SinhVien sv: this.listSV) {
			if(sv.getMaSV() == maSV) {
				this.listSV.remove(sv);
				delete = true;
				break;
			}
		}
		return delete;
	}
}
