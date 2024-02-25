import java.util.Scanner;

public class MainClass {

	final static int NUM = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		inLeDungFor(scan);
		System.out.println("\n");
		inChanDungFor(scan);
		System.out.println("\n");
		inLeDungForCach2(scan);
		System.out.println("\n");
		inLeDungWhile(scan);
		System.out.println("\n");
		inChanDungWhile(scan);
	}

	public static void inLeDungFor(Scanner scan) {
		for (int i = 0; i < NUM; i++) {
			if (i % 2 != 0) {
				System.out.print(i + "\t");
			}
		}
	}

	public static void inChanDungFor(Scanner scan) {
		for (int i = 0; i < NUM; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
			}
		}
	}

	public static void inLeDungForCach2(Scanner scan) {
		for (int i = 1; i < NUM; i += 2) {
			System.out.print(i + "\t");
		}
	}

	public static void inLeDungWhile(Scanner scan) {
		int i = 1;
		while (i < NUM) {
			System.out.print(i + "\t");
			i += 2;
		}
	}

	public static void inChanDungWhile(Scanner scan) {
		int i = 0;
		while (i < NUM) {
			System.out.print(i + "\t");
			i += 2;
		}
	}
}
