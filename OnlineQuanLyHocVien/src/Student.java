import java.util.Scanner;

public class Student extends Person {

	private float toan;
	private float ly;
	private float hoa;
	
	public float getToan() {
		return toan;
	}

	public void setToan(float toan) {
		this.toan = toan;
	}

	public float getLy() {
		return ly;
	}

	public void setLy(float ly) {
		this.ly = ly;
	}

	public float getHoa() {
		return hoa;
	}

	public void setHoa(float hoa) {
		this.hoa = hoa;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String hoTen, String diaChi, String ma, String email, float toan, float ly, float hoa) {
		super(hoTen, diaChi, ma, email);
		this.toan = toan;
		this.hoa = hoa;
		this.ly = ly;
	}

	@Override 
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Nhập điểm toán: ");
		this.toan = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập điểm lý: ");
		this.ly = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập điểm hóa: ");
		this.hoa = Float.parseFloat(scan.nextLine());
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Toán: " + this.toan + " \t Lý: " + this.ly + "\t Hóa: " + this.hoa);
	}
}
