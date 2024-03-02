import java.util.ArrayList;
import java.util.Scanner;

public class PhongBan implements NhapXuat {

	private String maPhongBan;
	private String tenPhongBan;
	private TruongPhong truongPhong;
	private ArrayList<NhanVienThuong> dsNhanVien;

	public String getMaPhongBan() {
		return maPhongBan;
	}

	public void setMaPhongBan(String maPhongBan) {
		this.maPhongBan = maPhongBan;
	}

	public String getTenPhongBan() {
		return tenPhongBan;
	}

	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}

	public TruongPhong getTruongPhong() {
		return truongPhong;
	}

	public void setTruongPhong(TruongPhong truongPhong) {
		this.truongPhong = truongPhong;
	}

	public ArrayList<NhanVienThuong> getDsNhanVien() {
		return dsNhanVien;
	}

	public void setDsNhanVien(ArrayList<NhanVienThuong> dsNhanVien) {
		this.dsNhanVien = dsNhanVien;
	}

	public PhongBan() {
		// TODO Auto-generated constructor stub
		this.truongPhong = null;
		this.dsNhanVien = new ArrayList<NhanVienThuong>();
	}

	public PhongBan(String maPhongBan, String tenPhongBan) {
		super();
		this.maPhongBan = maPhongBan;
		this.tenPhongBan = tenPhongBan;
		this.dsNhanVien = new ArrayList<NhanVienThuong>();
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		System.out.println("*******Đây là thông tin phòng ban*******");
		System.out.println("Tên: " + this.tenPhongBan + "\t Mã: " + this.maPhongBan);
		if(this.truongPhong != null ) {
			System.out.println("Đây là thông tin trưởng phòng");
			this.truongPhong.xuat();
		} else {
			System.out.println("Phòng ban chưa có trưởng phòng");
		}
		for(NhanVienThuong nvt: this.dsNhanVien) {
			nvt.xuat();
		}
		System.out.println("==========End thông tin phòng ban===========");
	}

}
