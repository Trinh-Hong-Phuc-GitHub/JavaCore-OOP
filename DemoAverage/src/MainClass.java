import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAU = 5;
		Scanner scan = new Scanner(System.in);
		int n;
		int sum = 0;
		System.out.println("Nhập vào số thứ nhất: ");
		n = Integer.parseInt(scan.nextLine());
		sum+=n;
		System.out.println("Nhập vào số thứ hai: ");
		n = Integer.parseInt(scan.nextLine());
		sum+=n;
		System.out.println("Nhập vào số thứ ba: ");
		n = Integer.parseInt(scan.nextLine());
		sum+=n;
		System.out.println("Nhập vào số thứ tư: ");
		n = Integer.parseInt(scan.nextLine());
		sum+=n;
		System.out.println("Nhập vào số thứ năm: ");
		n = Integer.parseInt(scan.nextLine());
		sum+=n;
		float average;
		average = (1.0f)*sum/MAU;
		System.out.println("Trung bình 5 số đã nhập là: " + average);
	}

}
