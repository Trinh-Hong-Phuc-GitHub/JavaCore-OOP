import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào 1 số nguyên thứ nhất: ");
		String value1 = scan.nextLine();
		System.out.println("Nhập vào 1 số nguyên thứ hai: ");
		String value2 = scan.nextLine();
		int num1 = Integer.parseInt(value1);
		int num2 = Integer.parseInt(value2);
		int tong = num1 + num2;
		System.out.println("Tổng là: " + tong);
	}
}
