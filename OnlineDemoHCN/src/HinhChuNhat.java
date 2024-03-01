import java.util.Scanner;

/*
 * Mục đích: Quản lý nghiệp vụ HCN
 * Người tạo: Trịnh Hồng Phúc
 * Ngày tạo: 28/2/2024
 * Version: 1.0
 */
public class HinhChuNhat {

	// 1. Các thuộc tính
	private float chieuDai;
	private float chieuRong;
	private float chuVi;
	private float dienTich;

	// 2. Các phương thức get, set

	public float getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
	}

	public float getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
	}

	public float getChuVi() {
		return chuVi;
	}

	public float getDienTich() {
		return dienTich;
	}

	// 3. Các phương thức khởi tạo

	public HinhChuNhat() {

	}

	public HinhChuNhat(float chieuDai, float chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	// 4. Các phương thức nhập, xuất
	public void nhap(Scanner scan) {
		System.out.println("Nhập chiều dài: ");
		this.chieuDai = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập chiều rộng: ");
		this.chieuRong = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println("HCN (" + chieuDai + ", " + chieuRong + "). Diện tích: " + dienTich + "\t Chu Vi: " + chuVi);
	}

	// 5. Các phương thức xử lý nghiệp vụ
	public void tinhChuVi() {
		this.chuVi = (chieuDai + chieuRong) * 2;
	}

	public void tinhDienTich() {
		this.dienTich = chieuDai * chieuRong;
	}
}
