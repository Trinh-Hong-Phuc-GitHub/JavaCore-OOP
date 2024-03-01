import java.util.Scanner;
public class XuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui lòng nhập tên sinh viên: ");
		String ten = scan.nextLine();
		System.out.println("Vui lòng nhập mail sinh viên: ");
		String email = scan.nextLine();
			
		System.out.println("Vui lòng điểm toán: ");
		float toan = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng điểm lý: ");
		float ly = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng điểm hóa: ");
		float hoa = Float.parseFloat(scan.nextLine());
		
		SinhVien sv2 = new SinhVien(ten, email);
		sv2.setDiemToan(toan);
		sv2.setDiemLy(ly);
		sv2.setDiemHoa(hoa);
		sv2.tinhDiemTB();
		
		System.out.println("Tên: " + sv2.getHoTen() + " - Email: " + sv2.getEmail() + " - Điểm trung bình: " + sv2.getDiemTB());

	}

}
