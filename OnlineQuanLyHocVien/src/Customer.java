import java.util.Scanner;
public class Customer extends Person {

	private String tenCongTy;
	private String danhGia;
	private float triGiaHoaDon;
	
	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public String getDanhGia() {
		return danhGia;
	}

	public void setDanhGia(String danhGia) {
		this.danhGia = danhGia;
	}

	public float getTriGiaHoaDon() {
		return triGiaHoaDon;
	}

	public void setTriGiaHoaDon(float triGiaHoaDon) {
		this.triGiaHoaDon = triGiaHoaDon;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String hoTen, String diaChi, String ma, String email, String tenCongTy, float triGiaHoaDon, String danhGia) {
		super(hoTen, diaChi, ma, email);
		this.danhGia = danhGia;
		this.triGiaHoaDon = triGiaHoaDon;
		this.tenCongTy = tenCongTy;
	}

	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Nhập tên công ty: ");
		this.tenCongTy = scan.nextLine();
		System.out.println("Nhập trị giá hóa đơn");
		this.triGiaHoaDon = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập đánh giá: ");
		this.danhGia = scan.nextLine();
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Tên công ty: " + this.tenCongTy + "\t Trị giá hóa đơn: " + this.triGiaHoaDon 
				+ "\t Đánh giá: " + this.danhGia);
	}
}
