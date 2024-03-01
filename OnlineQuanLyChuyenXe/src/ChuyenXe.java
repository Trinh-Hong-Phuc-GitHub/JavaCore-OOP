import java.util.Scanner;
/*
 * Mục đích: Lớp cha quản lý chuyến xe
 * */
public class ChuyenXe {

	protected String maSoChuyen;
	protected String hoTenTaiXe;
	protected String soXe;
	protected float doanhThu;
	
	public String getMaSoChuyen() {
		return maSoChuyen;
	}

	public void setMaSoChuyen(String maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}

	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}

	public void setHoTenTaiXe(String hoTenTaiXe) {
		this.hoTenTaiXe = hoTenTaiXe;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	public float getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(float doanhThu) {
		this.doanhThu = doanhThu;
	}

	public ChuyenXe() {
		// TODO Auto-generated constructor stub
	}

	public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu) {
		this.maSoChuyen = maSoChuyen;
		this.hoTenTaiXe = hoTenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}

	public void nhap(Scanner scan) {
		System.out.println("Nhập mã số chuyến: ");
		this.maSoChuyen = scan.nextLine();
		System.out.println("Nhập họ tên tài xế: ");
		this.hoTenTaiXe = scan.nextLine();
		System.out.println("Nhập số xe: ");
		this.soXe = scan.nextLine();
		System.out.println("Nhập doanh thu: ");
		this.doanhThu = Float.parseFloat(scan.nextLine());
	}
	
	public void xuat() {
		System.out.print("Mã số chuyến: " + this.maSoChuyen
				+ "\t Họ tên tài xế: " + this.hoTenTaiXe
				+ "\t Số xe: " + this.soXe
				+ "\t Doanh thu: " + this.doanhThu);
	}
}
