import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		soNguyenDuongNhoNhat();
	}

	public static void soNguyenDuongNhoNhat() {
		int sum = 0;
		int a = 0;
		do {
			sum += a;
			a += 1;
		} while (sum <= 10000);
		System.out.println("n là: " + a);
	}
}
