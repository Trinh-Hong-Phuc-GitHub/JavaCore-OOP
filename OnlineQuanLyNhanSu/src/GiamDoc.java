import java.util.Scanner;

public class GiamDoc extends NhanSu {

	final int LUONG_NGAY = 300;
	
	private float coPhan;

	public float getCoPhan() {
		return coPhan;
	}

	public void setCoPhan(float coPhan) {
		this.coPhan = coPhan;
	}

	public GiamDoc() {
		// TODO Auto-generated constructor stub
	}

	public GiamDoc(String maSo, String hoTen, String soDienThoai, float soNgayLamViec, float coPhan) {
		super(maSo, hoTen, soDienThoai, soNgayLamViec);
		this.coPhan = coPhan;
	}

	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Nhập số cổ phần: ");
		this.coPhan = Float.parseFloat(scan.nextLine());
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Số cổ phần: " + this.coPhan + "\t Lương: " + this.luong);
	}
	
	@Override
	public void tinhLuong() {
		this.luong = this.soNgayLamViec*LUONG_NGAY;
	}
}
