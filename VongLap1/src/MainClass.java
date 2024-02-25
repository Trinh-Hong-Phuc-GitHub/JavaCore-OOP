import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		oneTuTi(scan);
	}

	public static void oneTuTi(Scanner scan) {
		int nguoi;
		int may = (int) (Math.random() * 3 + 1);
		int demMay = 0;
		int demNguoi = 0;
		do {
			System.out.println("Nhập: ");
			System.out.println("1. Búa");
			System.out.println("2. Kéo");
			System.out.println("3. Lá");
			nguoi = Integer.parseInt(scan.nextLine());
			if (nguoi == 1 && may == 2 || nguoi == 2 & may == 3 || nguoi == 3 && may == 1) {
				System.out.println("Người thắng");
				demNguoi += 1;
			} else if (nguoi == 2 && may == 1 || nguoi == 3 & may == 2 || nguoi == 1 && may == 3) {
				System.out.println("Máy thắng");
				demMay += 1;
			} else {
				System.out.println("Hòa");
			}
		} while (nguoi != 0);
		System.out.println("Số lần máy thắng là: " + demMay);
		System.out.println("Số lần người thắng là: " + demNguoi);
		if (demMay > demNguoi) {
			System.out.println("Máy thắng nhiều hơn");
		} else if (demMay < demNguoi) {
			System.out.println("Người thắng nhiều hơn");
		} else {
			System.out.println("Máy và người hòa");
		}
	}
}
