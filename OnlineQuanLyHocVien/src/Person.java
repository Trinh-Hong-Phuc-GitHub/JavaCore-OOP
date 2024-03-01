import java.util.Scanner;

public class Person {

	protected String hoTen;
	protected String diaChi;
	protected String ma;
	protected String email;
	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String hoTen, String diaChi, String ma, String email) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.ma = ma;
		this.email = email;
	}

	public void nhap(Scanner scan) {
		System.out.println("Nhập họ tên: ");
		this.hoTen = scan.nextLine();
		System.out.println("Nhập địa chỉ: ");
		this.diaChi = scan.nextLine();
		System.out.println("Nhập mã: ");
		this.ma = scan.nextLine();
		System.out.println("Nhập email: ");
		this.email = scan.nextLine();
	}
	
	public void xuat() {
		System.out.print("Họ tên: " + this.hoTen + "\t Mã: " + this.ma + 
				"\t Địa chỉ: " + this.diaChi + "\t Email: " + this.email);
	}
}
