import java.util.Scanner;

public class GiaoDichTienTe extends GiaoDich {

	private float tiGia;
	private int loaiTienTe;

	public float getTiGia() {
		return tiGia;
	}

	public void setTiGia(float tiGia) {
		this.tiGia = tiGia;
	}

	public int getLoaiTienTe() {
		return loaiTienTe;
	}

	public void setLoaiTienTe(int loaiTienTe) {
		this.loaiTienTe = loaiTienTe;
	}

	public GiaoDichTienTe() {
		// TODO Auto-generated constructor stub
	}

	public GiaoDichTienTe(int maGiaoDich, int ngay, int thang, int nam, float donGia, int soLuong, float tiGia,
			int loaiTienTe) {
		super(maGiaoDich, ngay, thang, nam, donGia, soLuong);
		this.tiGia = tiGia;
		this.loaiTienTe = loaiTienTe;
	}

	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Nhập tỉ giá: ");
		this.tiGia = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập loại tiền tệ (1. VND, 2. USD, 3.EURO): ");
		this.loaiTienTe = Integer.parseInt(scan.nextLine());
	}

	@Override
	public void xuat() {
		String temp = "";
		if(this.loaiTienTe == 1) {
			temp = "VND";
		} else if(this.loaiTienTe == 2) {
			temp = "USD";
		} else {
			temp = "EURO";
		}
		System.out.println("\t Tiền: " + temp + "\t Tỉ giá: " + this.tiGia + "\t Thành tiền: " + this.thanhTien);
	}
	
	@Override
	public void tinhTien() {
		if (this.loaiTienTe == 1) {
			this.thanhTien = this.soLuong * this.donGia;
		} else {
			this.thanhTien = this.soLuong * this.donGia * this.tiGia;
		}
	}
}
