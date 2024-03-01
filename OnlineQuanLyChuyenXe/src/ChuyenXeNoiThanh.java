import java.util.Scanner;

public class ChuyenXeNoiThanh extends ChuyenXe {

	private String soTuyen;
	private float soKM;

	public String getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}

	public float getSoKM() {
		return soKM;
	}

	public void setSoKM(float soKM) {
		this.soKM = soKM;
	}

	public ChuyenXeNoiThanh() {
		// TODO Auto-generated constructor stub
		super();
	}

	public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu, String soTuyen, float soKM) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKM = soKM;
	}

	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Nhập số tuyến: ");
		this.soTuyen = scan.nextLine();
		System.out.println("Nhập số KM: ");
		this.soKM = Float.parseFloat(scan.nextLine());
	}
	
	@Override 
	public void xuat() {
		super.xuat();
		System.out.println("\t Số tuyến: " + this.soTuyen + "\t Số KM: " + this.soKM);
	}
}
