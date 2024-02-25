import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float xC;
		float yC;
		float R;
		float xM;
		float yM;
		System.out.println("Vui lòng nhập vào xC: ");
		xC = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập vào yC: ");
		yC = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập vào bán kính đường tròn: ");
		R = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập vào xM: ");
		xM = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập vào yM: ");
		yM = Float.parseFloat(scan.nextLine());
		double d;
		d = Math.sqrt((xM-xC)*(xM-xC)+(yM-yC)*(yM-yC));
		String text;
		if (d>R) {
			text = "M nằm ngoài đường tròn";
		} else if (d == R) {
			text = "M nằm trên đường tròn";
		} else {
			text = "M nằm trong đường tròn";
		}
		System.out.println(text);
	}

}
