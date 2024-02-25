import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int chieuDaiSan;
		int banKinh;
		int khongGianCanThiet;
		System.out.println("Nhập vào chiều dài sân: ");
		chieuDaiSan = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập vào bán kính của 1 cây phát triển đầy đủ: ");
		banKinh = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập vào không gian cần thiết giữa các cây để cây phát triển đầy đủ: ");
		khongGianCanThiet = Integer.parseInt(scan.nextLine());
		int soLuongCay;
		soLuongCay = chieuDaiSan/(banKinh*2+khongGianCanThiet);
		int tongKhongGian;
		tongKhongGian = soLuongCay*banKinh*2;
		System.out.println("Số cây trồng được trong sân là: " + soLuongCay);
		System.out.println("Tổng không gian chiếm bởi cây trồng hoàn toàn: " + tongKhongGian);
	}

}
