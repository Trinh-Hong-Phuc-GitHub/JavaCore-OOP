import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;
		int unit;
		int ten;
		int hundred;
		int sum;
		System.out.print("Vui lòng nhập vào n: ");
		n = Integer.parseInt(scan.nextLine());
		hundred = n/100;
		ten = (n%100)/10;
		unit = n%10;
		sum = hundred + ten + unit;
		System.out.println("Tổng 3 ký số của n = " + n + " là " + sum);
	}

}
