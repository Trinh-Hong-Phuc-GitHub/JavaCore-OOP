import java.util.Scanner;

public class Employee extends Person {
	
	private int soNgayLamViec;
	private float luongTheoNgay;

	public int getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(int soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	public float getLuongTheoNgay() {
		return luongTheoNgay;
	}

	public void setLuongTheoNgay(float luongTheoNgay) {
		this.luongTheoNgay = luongTheoNgay;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String hoTen, String diaChi, String ma, String email, int soNgayLamViec, float luongTheoNgay) {
		super(hoTen, diaChi, ma, email);
		this.soNgayLamViec = soNgayLamViec;
		this.luongTheoNgay = luongTheoNgay;
	}

	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Nhập vào số ngày làm việc: ");
		this.soNgayLamViec = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập lương theo ngày: ");
		this.luongTheoNgay = Float.parseFloat(scan.nextLine());
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Số ngày làm việc: " + this.soNgayLamViec + "\t Lương theo ngày: " + luongTheoNgay);
	}
}
