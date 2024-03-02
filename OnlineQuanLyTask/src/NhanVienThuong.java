import java.util.Scanner;
public class NhanVienThuong extends NhanSu {
	final int LUONG_NGAY = 200;
	final int PHU_CAP_1 = 300;
	final int PHU_CAP_2 = 1000;

	public NhanVienThuong() {
		// TODO Auto-generated constructor stub
		super();
	}

	public NhanVienThuong(String maNV, String tenNV, String namSinh, String email, String soDienThoai,
			float soNgayLamViec, String maPhongBan) {
		super(maNV, tenNV, namSinh, email, soDienThoai, soNgayLamViec, maPhongBan);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub

	}

}
