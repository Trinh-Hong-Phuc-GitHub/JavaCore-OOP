import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int d1;
		int d2;
		int bigger;
		System.out.println("Nhập vào số 1: ");
		d1 = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập vào số 2: ");
		d2 = Integer.parseInt(scan.nextLine());
		if (d1>d2) {
			bigger = d1;
		} else {
			bigger = d2;
		} 
		System.out.println("Số lớn hơn là: " + bigger);
	}

}
