import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = Integer.parseInt(scan.nextLine());
		inFibo(n);
	}

	public static int fibonacci(int x) {
		int ketQua;
		int a0 = 0;
		int a1 = 1;
		int an = 1;
		if (x < 0) {
			ketQua = -1;
		} else if (x == 0 || x == 1) {
			ketQua = x;
		} else {
			for (int i = 2; i < x; i++) {
				a0 = a1;
				a1 = an;
				an = a0 + a1;
			}
			ketQua = an;
		}
		return ketQua;
	}

	public static void inFibo(int n) {
		System.out.println(n + " chữ số đầu tiên trong dãy fibonacci");
		for (int i = 0; i < n; i++) {
			int ai = fibonacci(i);
			System.out.print(ai + "\t");
		}
	}
}
