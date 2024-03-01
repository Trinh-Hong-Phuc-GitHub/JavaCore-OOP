import java.util.Scanner;

public class GiaoDichVang extends GiaoDich {

	private String loaiVang;

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}

	public GiaoDichVang() {
		// TODO Auto-generated constructor stub
	}

	public GiaoDichVang(int maGiaoDich, int ngay, int thang, int nam, float donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngay, thang, nam, donGia, soLuong);
		// TODO Auto-generated constructor stub
		this.loaiVang = loaiVang;
	}

	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Nhập loại vàng: ");
		this.loaiVang = scan.nextLine();
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Loại vàng: " + this.loaiVang + "\t Thành tiền: " + this.thanhTien);
	}
	
	@Override 
	public void tinhTien() {
		this.thanhTien = this.donGia*this.soLuong;
	}
}
