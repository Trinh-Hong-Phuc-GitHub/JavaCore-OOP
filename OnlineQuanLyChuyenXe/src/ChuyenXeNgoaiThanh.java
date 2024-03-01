import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends ChuyenXe {

	private float soNgayDiDuoc;
	private String noiDen;
	
	public float getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}

	public void setSoNgayDiDuoc(float soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public ChuyenXeNgoaiThanh() {
		// TODO Auto-generated constructor stub
		super();
	}

	public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu, String noiDen, float soNgayDiDuoc) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		// TODO Auto-generated constructor stub
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Nhập nơi đến: ");
		this.noiDen = scan.nextLine();
		System.out.println("Nhập số ngày đi được: ");
		this.soNgayDiDuoc = Float.parseFloat(scan.nextLine());
	}
	
	@Override 
	public void xuat() {
		super.xuat();
		System.out.println("\t Nơi đến: " + this.noiDen + "\t Số ngày đi được: " + this.soNgayDiDuoc);
	}
}
