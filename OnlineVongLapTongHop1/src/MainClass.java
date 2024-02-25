import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = Integer.parseInt(scan.nextLine());
		xuLySo(n);
	}

	public static void xuLySo(int n) {
		int soBanDau = n; // tạo bản sao của n để xử lý
		int soDangTach; // Tách dần theo thứ tự từ hàng đơn vị về trước
		int tongCacSo = 0;
		int dem = 0;
		do {
			soDangTach = soBanDau % 10;
			dem++;
			tongCacSo += soDangTach;
			soBanDau /= 10;
		} while (soBanDau != 0);

		System.out.println("Số " + n + " có " + dem + " chữ số");
		System.out.println("Chữ số cuối cùng là: " + (n % 10));
		System.out.println("Chữ số hàng đầu tiên: " + soDangTach);
		System.out.println("Tổng các chữ số là: " + tongCacSo);

		// Đảo ngược số n
		System.out.println("Số đảo ngược của " + n + " là: ");
		// loại bỏ các số 0
		while (n % 10 == 0) {
			n /= 10;
		}

		do {
			System.out.print("" + (n % 10));
			n /= 10;
		} while (n != 0);
	}
}
