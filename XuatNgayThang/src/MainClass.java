import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int month;
		int day = 0;
		System.out.println("Vui lòng nhập vào tháng: ");
		month = Integer.parseInt(scan.nextLine());
		boolean flag = true; // giả sử tháng hợp lệ
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		default:
			flag = false;
			System.out.println("Nhập vào ngày hợp lệ trong khoảng 1-12");
		}
		if (flag) {
			System.out.println("Tháng " + month + " hợp lệ");
			System.out.println("Số ngày trong tháng: " + day);
		} else {
			System.out.println("Tháng không hợp lệ");
		}
		
	}

}
