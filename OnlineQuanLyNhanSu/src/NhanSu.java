import java.util.Scanner;

public class NhanSu {

	protected String maSo;
	protected String hoTen;
	protected String soDienThoai;
	protected float soNgayLamViec;
	protected float luong;

	public float getLuong() {
		return luong;
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	public NhanSu() {
		// TODO Auto-generated constructor stub
	}

	public NhanSu(String maSo, String hoTen, String soDienThoai, float soNgayLamViec) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.soNgayLamViec = soNgayLamViec;
	}

	public void nhap(Scanner scan) {
		System.out.println("=================Thêm nhân sự=================");
		System.out.println("Nhập mã số: ");
		this.maSo = scan.nextLine();
		System.out.println("Nhập họ tên: ");
		this.hoTen = scan.nextLine();
		System.out.println("Nhập số điện thoại: ");
		this.soDienThoai = scan.nextLine();
		System.out.println("Nhập số ngày làm việc: ");
		this.soNgayLamViec = Float.parseFloat(scan.nextLine());
		System.out.println("=================Kết thúc=================");
	}

	public void xuat() {
		System.out.print("Mã số: " + this.maSo + "\t Họ tên: " + this.hoTen + "\t SĐT: " + this.soDienThoai
				+ "\t Số ngày làm: " + this.soNgayLamViec);
	}

	public void xuatMaVaTen() {
		System.out.println("Mã: " + this.maSo + "\t Họ tên: " + this.hoTen);
	}

	public void tinhLuong() {
		this.luong = 0;
	}
}
