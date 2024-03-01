import java.util.Scanner;

/*
 * Mục đích: Quản lý nghiệp vụ liên quan sinh viên
 * Người tạo: Trịnh Hồng Phúc
 * Ngày tạo: 29/02/2024
 * Version: 1.0
 * */
public class SinhVien {

	private String tenSV;
	private int maSV;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float diemTB;
	private String xepLoai;

	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	public SinhVien() {
		// TODO Auto-generated constructor stub
	}

	public SinhVien(String tenSV, int maSV, float diemToan, float diemLy, float diemHoa) {
		super();
		this.tenSV = tenSV;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	public void nhap(Scanner scan) {
		System.out.println("Nhập mã sinh viên: ");
		this.maSV = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập tên sinh viên: ");
		this.tenSV = scan.nextLine();
		System.out.println("Nhập điểm toán: ");
		this.diemToan = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập điểm hóa: ");
		this.diemHoa = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập điểm lý: ");
		this.diemLy = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println("Sinh viên - Mã: " + this.maSV + "\t Tên: " + this.tenSV + "\t Điểm Toán: " + this.diemToan
				+ "\t Điểm Lý: " + this.diemLy + "\t Điểm Hóa: " + this.diemHoa + "\t ĐTB: " + this.diemTB
				+ "\t Xếp loại: " + this.xepLoai);
	}

	public void tinhDiemTB() {
		this.diemTB = (this.diemHoa + this.diemLy + this.diemToan) / 3;
	}
	
	public void xepLoai() {
		if(diemTB>=9) {
			this.xepLoai = "Xuất sắc";
		} else if (this.diemTB >= 8) {
			this.xepLoai = "Giỏi";
		} else if ( this.diemTB >= 7) {
			this.xepLoai = "Khá";
		} else if (this.diemTB >=6) {
			this.xepLoai = "TB Khá";
		} else if (this.diemTB >= 5) {
			this.xepLoai = "Trung Bình";
		} else {
			this.xepLoai = "Yếu";
		}
	}
	
	private String formatNumCell(Number num) {
		String paddLeft = "%5s";
		String paddRight = "%-8s";
		return String.format(paddLeft, "") + String.format(paddRight, num) + "|";
	}
	
	private String formatTextCell(String text) {
		String paddLeft = "%-15s";
		return String.format(paddLeft, " " + text);
	}
	
	public void xuatRowFormat() {
		String text;
		text = formatNumCell(this.maSV);
		text += formatTextCell(this.tenSV) + "|";
		text += formatNumCell(this.diemToan);
		text += formatNumCell(this.diemLy);
		text += formatNumCell(this.diemHoa);
		
		double dtb = Math.round(this.diemTB*100.0)/100.0; // làm tròn 2 chữ số
		text += formatNumCell(dtb);
		text += formatTextCell(this.xepLoai) + "||";
		System.out.println(text);
	}
}
 