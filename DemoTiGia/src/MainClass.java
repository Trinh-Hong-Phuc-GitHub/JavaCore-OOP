import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		final float TI_GIA = 23500;
		float USD;
		System.out.println("Nhập vào số tiền USD: ");
		USD = Float.parseFloat(scan.nextLine());
		float VND;
		VND = USD * TI_GIA;
		System.out.println("Đổi " + USD + " ra tiền VND: " + VND + "đ");
	}

}
