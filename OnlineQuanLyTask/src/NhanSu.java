import java.util.ArrayList;
import java.util.Scanner;

public abstract class NhanSu implements NhapXuat{

	protected String maNV;
	protected String tenNV;
	protected String namSinh;
	protected String email;
	protected String soDienThoai;
	protected String maPhongBan;
	protected DanhSachTask objDSTask;
	protected float luong;
	protected float soNgayLamViec;

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getMaPhongBan() {
		return maPhongBan;
	}

	public void setMaPhongBan(String maPhongBan) {
		this.maPhongBan = maPhongBan;
	}

	public DanhSachTask getObjDSTask() {
		return objDSTask;
	}

	public void setObjDSTask(DanhSachTask objDSTask) {
		this.objDSTask = objDSTask;
	}

	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	public float getLuong() {
		return luong;
	}

	private void init() {
		this.maPhongBan = "-1";
		this.objDSTask = new DanhSachTask();
	}
	
	public NhanSu() {
		// TODO Auto-generated constructor stub
		init();
	}

	public NhanSu(String maNV, String tenNV, String namSinh, String email, String soDienThoai, float soNgayLamViec, String maPhongBan) {
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.namSinh = namSinh;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.soNgayLamViec = soNgayLamViec;
		init();
	}
	
	public void xuat() {
		String temp = this.maPhongBan;
		if(this.maPhongBan.equalsIgnoreCase("-1")) {
			temp = "Chưa phân bổ";
		}
		System.out.println("Mã: " + this.maNV + "\t Tên: " + this.tenNV + "\t Năm sinh: " 
						+ this.namSinh + "\t Email: " + this.email + "\t Số điện thoại: " + this.soDienThoai 
						+ "\t Mã phòng ban: " + temp + "\t Số ngày làm: " + this.soNgayLamViec
						+ "\t Lương: " + this.luong);
		// Bổ sung xuất ds task nhân sự
		if(this.objDSTask.getListTask().size()>0) {
			System.out.println("Danh sách task của nhân sự này đang thực hiện: ");
			this.objDSTask.xuat();
		}
	}

	public void xuatTenVaMa() {
		System.out.println("Mã: " + this.maNV + "\t Tên: " + this.tenNV);
	}
	
	public abstract void tinhLuong();
}
