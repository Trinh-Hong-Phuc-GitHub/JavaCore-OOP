import java.util.Scanner;
public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Khởi tạo đối tượng
		Scanner scan = new Scanner(System.in);

//		HinhChuNhat hcn = new HinhChuNhat();
//		hcn.nhap(scan);
		
		System.out.println("Nhập chiều dài: ");
		float chieuDai = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập chiều rộng: ");
		float chieuRong = Float.parseFloat(scan.nextLine());
		HinhChuNhat hcn = new HinhChuNhat(chieuDai, chieuRong);
		hcn.tinhChuVi();
		hcn.tinhDienTich();
		hcn.xuat();
		
	}

}
