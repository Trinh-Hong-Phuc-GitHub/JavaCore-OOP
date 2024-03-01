import java.util.ArrayList;
import java.util.Scanner;
public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		CongTy cty = new CongTy();
		// Test chức năng
		cty.dummyDataCity(); // tạo dữ liệu công ty
		cty.dummyDataNhanSu(); // tạo dữ liệu cho nhân sự
		cty.tinhLuong(); 
		//cty.phanBoNhanVienThuong();
		//cty.tinhLuong(); 
		cty.xuat();
		// cty.themNhanSu(scan);
		//cty.xoaNhanSu(scan);
		//cty.tinhLuong(); 
//		System.out.println("*********Danh sách nhân viên thường có lương cao nhất*********");
//		ArrayList<NhanVienThuong> list = cty.lietKeDSNVTLuongCaoNhat();
//		for(NhanVienThuong nvt: list) {
//			nvt.xuat();
//		}
		//cty.xuat();
		cty.sortName();
		System.out.println("Danh sách nhân viên đã sắp xếp theo tên: ");
		cty.xuat();
	}

}
