import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Chương trình kiểm tra 1 số là số lẻ hay chẵn");
		System.out.println("Nhập vào 1 số: ");
		int a = Integer.parseInt(scan.nextLine());
		boolean ketQua = kiemTraChanLe(a);
		if(ketQua) {
			System.out.println("Số chẵn!");
		} else {
			System.out.println("Số lẻ!");
		}
	}

	public static boolean kiemTraChanLe(int a) {
		boolean ketQua;
		if (a%2==0) {
			ketQua = true;
		} else {
			ketQua = false;
		}
		return ketQua;
	}
}
