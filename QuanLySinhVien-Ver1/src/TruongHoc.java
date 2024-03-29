/*
 * Mục đích: QUản lý toàn bộ nghiệp vụ trường học
 * */
import java.util.ArrayList;
import java.util.Scanner;

public class TruongHoc {

	private DanhSachSinhVien dssvToanTruong;
	
	public DanhSachSinhVien getDssvToanTruong() {
		return dssvToanTruong;
	}

	public void setDssvToanTruong(DanhSachSinhVien dssvToanTruong) {
		this.dssvToanTruong = dssvToanTruong;
	}

	public TruongHoc() {
		// TODO Auto-generated constructor stub
		this.dssvToanTruong = new DanhSachSinhVien();
	}

	public TruongHoc(DanhSachSinhVien dssvToanTruong) {
		super();
		this.dssvToanTruong = dssvToanTruong;
	}

	public void nhap() {
		SinhVien sv = new SinhVien("Lan", 1, 9.2f, 2, 9);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Thuần", 2, 4.2f, 4, 5.3f);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Lan", 3, 7.2f, 4, 9);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Yến", 4, 3.2f, 4, 4);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Toàn", 5, 9.2f, 10, 10);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Hữu", 6, 7.2f, 7, 6);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Lý", 7, 3.2f, 7, 7);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Trung", 8, 9.2f, 10, 10);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Quyền", 9, 7.2f, 7, 8);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Linh", 10, 5.2f, 5, 6);
		this.dssvToanTruong.themSinhVien(sv);
	}
	
	public void themSinhVien(SinhVien sv) {
		this.dssvToanTruong.themSinhVien(sv);
	}
	
	public void xuat() {
		this.dssvToanTruong.xuat();
	}
	
	public void tinhDiemTB() {
		this.dssvToanTruong.tinhDiemTB();
	}
	
	public void xepLoai() {
		this.dssvToanTruong.xepLoai();
	}
	
	public ArrayList<SinhVien> timDanhSachSVDTBCaoNhat() {
		return this.dssvToanTruong.timDanhSachSVDTBCaoNhat();
	}
	
	public ArrayList<SinhVien> lietKeDSSVYeu(){
		return this.dssvToanTruong.lietKeDSSVYeu();
	}
	
	public void xuatHelper(ArrayList<SinhVien> list) {
		for(SinhVien sv: list) {
			sv.xuat();
		}
	}
	
	public ArrayList<SinhVien> timKiemTheoTen(String tenSV){
//		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
//		for(SinhVien sv: dssvToanTruong.getListSV()) {
//			if(sv.getTenSV().equals(tenSV)) {
//				list.add(sv);
//			}
//		}
		return dssvToanTruong.timKiemTheoTen(tenSV);
	}
	
	public SinhVien timKiemTheoMa(int maSV) {
		return dssvToanTruong.timKiemTheoMa(maSV);
	}
	
	public boolean xoaSinhVienTheoMa(int maSV) {
		return dssvToanTruong.xoaSVTheoMa(maSV);
	}
	
	private void xuatLine() {
		System.out.println("===================================================================================================================");
	}
	
	private String formatCell(String paddLeft, String title, String paddRight) {
		return String.format(paddLeft, " ") + title + String.format(paddRight, " ");
	}
	
	private void xuatRowHeader(){
		String paddString1 = "%3s";
		String paddString2 = "%4s";
		String paddString3 = "%5s";
		String paddString4 = "%6s";
		
		xuatLine();
		String text;
		text = "||" + formatCell(paddString1, "STT", paddString1) + "|";
		text+= formatCell(paddString2,"Mã SV",paddString3) + "|";
		text+= formatCell(paddString3,"Tên SV",paddString2) + "|";
		text+= formatCell(paddString3,"Toán",paddString2) + "|";
		text+= formatCell(paddString3,"Lý",paddString4) + "|";
		text+= formatCell(paddString3,"Hóa",paddString3) + "|";
		text+= formatCell(paddString3,"ĐTB",paddString3) + "|";
		text+= formatCell(paddString2,"Xếp loại",paddString1) + "||";
		System.out.println(text);
		xuatLine();
	}
	private void xuatCellThuTu(int i) {
		String paddLeft = "%3s";
		String paddRight = "%-6s";
		String text = "||" + String.format(paddLeft, " ") + String.format(paddRight, " " + i) + "||";
		System.out.print(text);
	}
	
	public void xuatTheoFormat(ArrayList<SinhVien> list) {
		xuatRowHeader();
		int i =1;
		for(SinhVien sv: list) {
			xuatCellThuTu(i);
			sv.xuatRowFormat();
			i++;
		}
		xuatLine();
	}
}
 