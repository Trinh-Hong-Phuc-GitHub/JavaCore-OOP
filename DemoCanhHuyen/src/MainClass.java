import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int edge1;
		int edge2;
		System.out.println("Vui lòng nhập vào cạnh góc vuông thứ nhất: ");
		edge1 = Integer.parseInt(scan.nextLine());
		System.out.println("Vui lòng nhập vào cạnh góc vuông thứ hai: ");
		edge2 = Integer.parseInt(scan.nextLine());
		double edge3;
		edge3 = Math.sqrt(edge1 * edge1 + edge2 * edge2);
		System.out.println("Cạnh huyền của tam giác là: " + edge3);
	}

}
