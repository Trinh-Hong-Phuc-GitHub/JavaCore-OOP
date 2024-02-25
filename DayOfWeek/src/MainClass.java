import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int d;
		int m;
		int y;
		int top; // số ngày tối đa trong tháng
		int dayOfWeek;
		boolean flag = true;
		System.out.println("Nhập vào ngày: ");
		d = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập vào tháng: ");
		m = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập vào năm: ");
		y = Integer.parseInt(scan.nextLine());

		if (y < 1582) {
			flag = false; // năm không hợp lệ
		}

		if (m > 12 && m < 1) {
			flag = false; // tháng không hợp lệ
		}

		switch (m) {
		case 4:
		case 6:
		case 9:
		case 11:
			top = 30;
			break;
		case 2:
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
				top = 29;
			} else {
				top = 28;
			}
			break;
		default:
			top = 31;
		}

		if (d < 1 || d > top) {
			flag = false;
		}

		if (!flag) {
			System.out.println("Không hợp lệ");
		} else {
			int a = (14 - m) / 12;
			y -= a;
			m += 12 * a - 2;
			dayOfWeek = (d + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
			if(dayOfWeek == 0) {
				System.out.println("Chủ nhật");
			} else {
				System.out.println("Thứ " + (dayOfWeek+1));
			}
		}
	}

}
