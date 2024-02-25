import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float tongKhongAm2 = tinhTongkhongAmCach1(scan);
		System.out.println("Tổng số > 0: " + tongKhongAm2);
	}

	public static float tinhTongkhongAmCach1(Scanner scan) {
		float tong = 0;
		int nhap = 1;
		while (nhap > 0) {
			System.out.println("Hãy nhập vào 1 số lớn hơn 0. Nhập <= 0 để dừng ");
			nhap = Integer.parseInt(scan.nextLine());
			if (nhap > 0) {
				tong += nhap;
			}
		}
		return tong;
	}

	public static float tinhTongkhongAmCach2(Scanner scan) {
		float tong = 0;
		boolean flag = true;
		while (flag) {
			System.out.println("Hãy nhập vào 1 số lớn hơn 0. Nhập <= 0 để dừng ");
			int nhap = Integer.parseInt(scan.nextLine());
			if (nhap > 0) {
				tong += nhap;
			} else {
				flag = false;
			}
		}
		return tong;
	}
}
