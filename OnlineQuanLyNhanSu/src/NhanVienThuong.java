import java.util.Scanner;

public class NhanVienThuong extends NhanSu {

	final int LUONG_NGAY = 100;

	private TruongPhong truongPhong;

	public TruongPhong getTruongPhong() {
		return truongPhong;
	}

	public void setTruongPhong(TruongPhong truongPhong) {
		this.truongPhong = truongPhong;
	}

	public NhanVienThuong() {
		this.truongPhong = null; // Chưa được phân bổ
		// TODO Auto-generated constructor stub
	}

	public NhanVienThuong(String maSo, String hoTen, String soDienThoai, float soNgayLamViec) {
		super(maSo, hoTen, soDienThoai, soNgayLamViec);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void xuat() {
		super.xuat();
		if (this.truongPhong != null) {
			System.out.println("\t Lương: " + this.luong + "\t Mã trưởng phòng: " + this.truongPhong.getMaSo()
					+ "\t Tên trưởng phòng: " + this.truongPhong.getHoTen());
		} else {
			System.out.println("\t Lương: " + this.luong + "\t Chưa phân bổ");
		}
	}

	@Override
	public void tinhLuong() {
		this.luong = this.soNgayLamViec * LUONG_NGAY;
	}
}
