import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		doanso(scan);
	}

	public static void doanso(Scanner scan) {
		int soBiMat = (int) (Math.random() * 99 + 1);
		int nhap;
		do {
			System.out.println("Vui lòng nhập vào 1 số: ");
			nhap = Integer.parseInt(scan.nextLine());
			if (nhap < soBiMat) {
				System.out.println("Vui lòng nhập vào số lớn hơn!");
			} else if (nhap > soBiMat) {
				System.out.println("Vui lòng nhập vào số nhỏ hơn!");
			}
		} while (soBiMat != nhap);
		System.out.println("Chúc mừng bạn đã đoán đúng!");
	}
}
