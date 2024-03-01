/*
 * Mục đích: Xử lý các nghiệp vụ liên quan đến Sinh Viên
 * Người tạo: 
 * Ngày tạo:
 * Version: 1.0
 * */
public class SinhVien {
	private String hoTen;
	private String email;
	private float diemToan;
	private float diemHoa;
	private float diemLy;
	private float diemTB;

	// Get, set methods
	public String getHoTen() {
		return this.hoTen;
	}

	public void setHoTen(String ten) {
		this.hoTen = ten;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Float getDiemToan() {
		return this.diemToan;
	}
	
	public void setDiemToan(float toan) {
		this.diemToan = toan;
	}
	
	public Float getDiemLy() {
		return this.diemLy;
	}
	
	public void setDiemLy(float ly) {
		this.diemLy = ly;
	}
	
	public Float getDiemHoa() {
		return this.diemHoa;
	}
	
	public void setDiemHoa(float hoa) {
		this.diemHoa = hoa;
	}
	
	public Float getDiemTB() {
		return this.diemTB;
	}
	// Phương thức khởi tạo mặc định không tham số
	public SinhVien() {

	}

	// Phương thức khởi tạo sử dụng 2 tham số để
	// truyền dữ liệu cho thuộc tính
	public SinhVien(String ten, String email) {
		this.hoTen = ten;
		this.email = email;
	}

	public void tinhDiemTB() {
		this.diemTB = (this.diemHoa + this.diemLy + this.diemToan) / 3;
	}
}
