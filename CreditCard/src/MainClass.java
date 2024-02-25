import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float INTEREST = 0.015f;
		Scanner scan = new Scanner(System.in);
		float creditCardBalance;
		float payment;
		float balance;
		float penalty = 0;
		System.out.println("Vui lòng nhập vào số dư thẻ tín dụng: ");
		creditCardBalance = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập số tiền đã thanh toán: ");
		payment = Float.parseFloat(scan.nextLine());
		balance = creditCardBalance - payment;
		if (balance > 0) {
			penalty = balance*INTEREST;
		} 
		System.out.println("Tiền phạt phải trả là: " + penalty);
	}
}
