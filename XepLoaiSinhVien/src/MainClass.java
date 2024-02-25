import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SO_CHIA = 3;
		final float MOC_1 = 8.5f;
		final float MOC_2 = 6.5f;
		final float MOC_3 = 5f;
		Scanner scan = new Scanner(System.in);
		String ten;
		float diemToan;
		float diemLy;
		float diemHoa;
		float diemTB;
		String xepLoai;
		System.out.print("Vui lòng nhập vào tên: ");
		ten = scan.nextLine();
		System.out.print("Nhập vào điểm toán: ");
		diemToan = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập vào điểm lý: ");
		diemLy = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập vào điểm hóa: ");
		diemHoa = Float.parseFloat(scan.nextLine());
		diemTB = (diemToan + diemLy + diemHoa)/SO_CHIA;
		if (diemTB>=MOC_1) {
			xepLoai = "Giỏi";
		} else if (diemTB>=MOC_2) {
			xepLoai = "Khá";
		} else if (diemTB>=MOC_3) {
			xepLoai = "Trung Bình";
		} else {
			xepLoai = "Yếu";
		}
		System.out.println("Xếp loại sinh viên: " + xepLoai);
	}

}
 