import java.util.Scanner;
public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanhSachChuyenXe objDSCX = new DanhSachChuyenXe();
		Scanner scan = new Scanner(System.in);
		// objDSCX.nhap(scan);
		objDSCX.dummyData();
		objDSCX.xuat();
		objDSCX.tinhTongDoanhThu();
		System.out.println("Tổng doanh thu: " + objDSCX.getTongDoanhThu());
		objDSCX.tinhDoanhThuNgoai();
		System.out.println("Doanh thu ngoại: " + objDSCX.getDoanhThuNgoai());
		objDSCX.tinhDoanhThuNoi();
		System.out.println("Doanh thu nội: " + objDSCX.getDoanhThuNoi());
		float doanhThuBinhThuan = objDSCX.tinhDoanhThuXeBinhThuan();
		System.out.println("Doanh thu xe Bình Thuận: " + doanhThuBinhThuan);
	}

}
