import java.util.Scanner;

public class MainClass {

	public static int timSoLonNhat(int a, int b, int c) {
		int soLonNhat = a;
		if (b > soLonNhat) {
			soLonNhat = b;
		}
		if (c > soLonNhat) {
			soLonNhat = c;
		}
		return soLonNhat;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Chương trình tìm số lớn nhất trong 3 số ");
		System.out.print("Nhập vào số thứ nhất: ");
		int a = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập vào số thứ hai: ");
		int b = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập vào số thứ ba: ");
		int c = Integer.parseInt(scan.nextLine());
		int soLonNhat = timSoLonNhat(a, b, c);
		System.out.println("Số lớn nhất trong 3 số " + a + ", " + b + ", " + c + " là: " + soLonNhat);
	}

}
