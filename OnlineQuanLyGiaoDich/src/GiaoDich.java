import java.util.Scanner;

public class GiaoDich {

	protected int maGiaoDich;
	protected int ngay;
	protected int thang;
	protected int nam;
	protected float donGia;
	protected int soLuong;
	protected float thanhTien;
	
	public int getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(int maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public float getThanhTien() {
		return thanhTien;
	}

	public GiaoDich() {
		
	}

	public GiaoDich(int maGiaoDich, int ngay, int thang, int nam, float donGia, int soLuong) {
		this.maGiaoDich = maGiaoDich;
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}

	public void nhap(Scanner scan) {
		System.out.println("Nhập mã: ");
		this.maGiaoDich = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập ngày: ");
		this.ngay = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập tháng: ");
		this.thang = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập năm: ");
		this.nam = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập số lượng: ");
		this.soLuong = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập đơn giá: ");
		this.donGia = Integer.parseInt(scan.nextLine());
	}
	
	public void xuat() {
		System.out.print("Mã: " + this.maGiaoDich + "\t Ngày/tháng/năm: " + this.ngay 
				+ "/" + this.thang + "/" + this.nam + "\t Số lượng: " + this.soLuong
				+ "\t Đơn giá: " + this.donGia);
	}
	
	public void tinhTien() {
		this.thanhTien = 0;
	}
}
