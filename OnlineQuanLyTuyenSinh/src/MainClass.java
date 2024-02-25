import java.util.Scanner;
public class MainClass {

	final static float KVA = 2;
	final static float KVB = 1;
	final static float KVC = 0.5f;
	
	final static float ĐT1 = 2.5f;
	final static float ĐT2 = 1.5f;
	final static float ĐT3 = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float diemChuan = nhapDiemChuan(scan);
		float tong3Diem = DiemTS(scan);
		String khuVuc = nhapKhuVuc(scan);
		int doiTuong = nhapDoiTuong(scan);
		float diemKhuVuc = uuTienKhuVuc(khuVuc);
		float diemDoiTuong = uuTienDoiTuong(doiTuong);
		float tongDiem = tongDiem(diemDoiTuong, diemKhuVuc, scan, tong3Diem);
		System.out.println("Điểm khu vực là: " + diemKhuVuc);
		System.out.println("Điểm hội đồng là: " + diemChuan);
		System.out.println("Điểm thí sinh là: " + tongDiem);
		xetDauRot(diemDoiTuong, diemChuan);
	}

	
	public static float nhapDiemChuan(Scanner scan) {
		float diemChuan;
		System.out.println("Vui lòng nhập điểm chuẩn hội đồng: ");
		diemChuan = Float.parseFloat(scan.nextLine());
		return diemChuan;
	}
	
	public static float DiemTS(Scanner scan) {
		float tong3Diem;
		float diem1;
		float diem2;
		float diem3;
		System.out.println("Vui lòng nhập điểm chuẩn môn thi 1: ");
		diem1 = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập điểm chuẩn môn thi 2: ");
		diem2 = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập điểm chuẩn môn thi 3: ");
		diem3 = Float.parseFloat(scan.nextLine());
		tong3Diem = diem1 + diem2 + diem3;
		return tong3Diem;
	}
	
	public static String nhapKhuVuc(Scanner scan) {
		String khuVuc;
		System.out.println("Nhập khu vực (A, B, C, X)");
		khuVuc = scan.nextLine();
		return khuVuc;
	}
	
	public static int nhapDoiTuong(Scanner scan) {
		int doiTuong;
		System.out.println("Nhập vào đối tượng (1, 2, 3, 0)");
		doiTuong = Integer.parseInt(scan.nextLine());
		return doiTuong;
	}
	
	public static float uuTienKhuVuc(String khuVuc) {
		float diemKhuVuc = 0;
		if (khuVuc.equals("A")) {
			diemKhuVuc = KVA;
		} 
		if (khuVuc.equals("B")) {
			diemKhuVuc = KVB;
		} 
		if (khuVuc.equals("C")) {
			diemKhuVuc = KVC;
 		} 
		return diemKhuVuc;
	}
	
	public static float uuTienDoiTuong(int doiTuong) {
		float diemDoiTuong = 0;
		if (doiTuong == 1) {
			diemDoiTuong = ĐT1;
		} 
		if (doiTuong == 2) {
			diemDoiTuong = ĐT2;
		} 
		if (doiTuong == 3) {
			diemDoiTuong = ĐT3;
 		} 
		return diemDoiTuong;
	}
	
	public static float tongDiem(float diemDoiTuong, float diemKhuVuc, Scanner scan, float tong3Diem) {
		float tongDiem = diemDoiTuong + diemKhuVuc + tong3Diem;
		return tongDiem;
	}
	
	public static void xetDauRot (float tongDiem, float diemChuan) {
		String ketQua;
		if (tongDiem >= diemChuan) {
			ketQua = "Đậu!";
		} else {
			ketQua = "Rớt!";
		}
		System.out.println("Kết quả là: " + ketQua);
	}
}
