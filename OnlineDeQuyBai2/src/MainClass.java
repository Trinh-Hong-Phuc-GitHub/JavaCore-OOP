import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println(tongGiaiThua(n));
	}

	public static long tongGiaiThua(int n) {
		if(n==1) {
			return 1;
		}
		return tongGiaiThua(n-1) + giaiThua(n-1)*n;
	}
	
	public static long giaiThua(int n) {
		if(n==1) {
			return 1;
		}
		return giaiThua(n-1)*n;
	}
}
