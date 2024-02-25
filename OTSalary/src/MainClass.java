import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int STANDARD_HOUR = 40;
		final float RATE_OT = 1.5f;
		Scanner scan = new Scanner(System.in);
		int hours;
		int rate;
		float payment;
		System.out.println("Số giờ đã làm: ");
		hours = Integer.parseInt(scan.nextLine());
		System.out.println("Lương 1 giờ: ");
		rate = Integer.parseInt(scan.nextLine());
		if (hours > STANDARD_HOUR) {
			payment = STANDARD_HOUR*rate + RATE_OT*rate*(hours-STANDARD_HOUR);
		} else {
			payment = STANDARD_HOUR*rate;
		}
		System.out.println("Số lương trả: " + payment);
	}

}
