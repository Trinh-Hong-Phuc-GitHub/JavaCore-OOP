import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int NUM_CHAD_PADD = -120;
		Scanner scan = new Scanner(System.in);
		String tenPhim;
		int giaVeLon;
		int giaVeNho;
		int soVeLon;
		int soVeNho;
		int phanTramTuThien;
		float tongThu;
		float tuThien;
		float conLai;
		System.out.print("Nhập vào tên phim: ");
		tenPhim = scan.nextLine();
		System.out.print("Nhập vào giá vé người lớn: ");
		giaVeLon = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập vào giá vé trẻ nhỏ: ");
		giaVeNho = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập vào số vé người lớn đã bán: ");
		soVeLon = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập vào số vé trẻ nhỏ đã bán: ");
		soVeNho = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập vào phần trăm từ thiện: ");
		phanTramTuThien = Integer.parseInt(scan.nextLine());
		tongThu = soVeLon * giaVeLon + soVeNho * giaVeNho;
		tuThien = (1.0f) * tongThu * phanTramTuThien/100f;
		conLai = tongThu - tuThien;
		String text = String.format("%1$" + NUM_CHAD_PADD + "s", "Tên-phim").replace(' ','.').replace('-',' ');
		System.out.println(text + tenPhim);
		text = String.format("%1$" + NUM_CHAD_PADD + "s", "Số-vé-đã-bán").replace(' ','.').replace('-',' ');
		System.out.println(text + (soVeLon + soVeNho));
		text = String.format("%1$" + NUM_CHAD_PADD + "s", "Doanh-thu").replace(' ','.').replace('-',' ');
		System.out.println(text + tongThu);
		text = String.format("%1$" + NUM_CHAD_PADD + "s", "Trích-%-từ-thiện").replace(' ','.').replace('-',' ');
		System.out.println(text + phanTramTuThien + "%");
		text = String.format("%1$" + NUM_CHAD_PADD + "s", "Tổng-tiền-trích-từ-thiện").replace(' ','.').replace('-',' ');
		System.out.println(text + tuThien);
		text = String.format("%1$" + NUM_CHAD_PADD + "s", "Tổng-thu-sau-khi-được-trừ").replace(' ','.').replace('-',' ');
		System.out.println(text + conLai);
	}

}
