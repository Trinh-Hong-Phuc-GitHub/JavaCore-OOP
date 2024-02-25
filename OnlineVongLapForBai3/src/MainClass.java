import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Mời nhập vào số n: ");
		int n = Integer.parseInt(scan.nextLine());
		int dem = demSoChiaHetCho3(n);
		System.out.println("Có " + dem + " từ 0 đến " + n + " chia hết cho 3");
	}

	public static int demSoChiaHetCho3(int n) {
		int dem = 0;
		for (int i = 0; i < n; i++) {
			if (i % 3 == 0) {
				dem++;
			}
		}
		return dem;
	}
}
