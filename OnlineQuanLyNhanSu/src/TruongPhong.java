import java.util.Scanner;

public class TruongPhong extends NhanSu {

	final int LUONG_NGAY = 200;
	final int PHU_CAP_MOI_NHAN_VIEN_QUAN_LY = 100;
	
	private int soLuongNhanVien;

	public int getSoLuongNhanVien() {
		return soLuongNhanVien;
	}

	public void setSoLuongNhanVien(int soLuongNhanVien) {
		this.soLuongNhanVien = soLuongNhanVien;
	}

	public TruongPhong() {
		this.soLuongNhanVien = 0;
	}

	public TruongPhong(String maSo, String hoTen, String soDienThoai, float soNgayLamViec) {
		super(maSo, hoTen, soDienThoai, soNgayLamViec);
		this.soLuongNhanVien = 0;
	}

//	@Override 
//	public void nhap(Scanner scan) {
//		super.nhap(scan);
//	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Lương: " + luong + "\t Số lượng nhân viên: " + this.soLuongNhanVien);
	}
	
	@Override
	public void tinhLuong() {
		this.luong = LUONG_NGAY*this.soNgayLamViec+PHU_CAP_MOI_NHAN_VIEN_QUAN_LY*this.soLuongNhanVien;
	}
	
	public void tangNhanVien() {
		this.soLuongNhanVien++;
	}
	
	public void giamNhanVien() {
		this.soLuongNhanVien--;
	}
}
