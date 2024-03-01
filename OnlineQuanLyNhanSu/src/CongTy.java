import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CongTy {

	private String tenCongTy;
	private String maSoThue;
	private float doanhThuThang;
	private DanhSachNhanSu objListNhanSu;

	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public String getMaSoThue() {
		return maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	public float getDoanhThuThang() {
		return doanhThuThang;
	}

	public void setDoanhThuThang(float doanhThuThang) {
		this.doanhThuThang = doanhThuThang;
	}

	public DanhSachNhanSu getObjListNhanSu() {
		return objListNhanSu;
	}

	public void setObjListNhanSu(DanhSachNhanSu objListNhanSu) {
		this.objListNhanSu = objListNhanSu;
	}

	public CongTy() {
		// TODO Auto-generated constructor stub
		this.objListNhanSu = new DanhSachNhanSu();
	}

	public void nhap(Scanner scan) {
		System.out.println("********Nhập thông tin công ty********");
		System.out.println("Nhập tên công ty:");
		this.tenCongTy = scan.nextLine();
		System.out.println("Nhập mã số thuế:");
		this.maSoThue = scan.nextLine();
		System.out.println("Nhập doanh thu: ");
		this.doanhThuThang = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println("********Thông tin công ty********");
		System.out.println("Tên công ty: " + this.tenCongTy);
		System.out.println("Mã số thuế: " + this.maSoThue);
		System.out.println("Doanh thu tháng: " + this.doanhThuThang);
		System.out.println("*********************************");
		this.objListNhanSu.xuat();
	}

	public void tinhLuong() {
		this.objListNhanSu.tinhLuong();
	}

	public void dummyDataCity() {
		this.tenCongTy = "FPT";
		this.maSoThue = "01292332";
		this.doanhThuThang = 435334;
	}

	public void dummyDataNhanSu() {
		NhanSu ns = new NhanSu();
		ns = new NhanVienThuong("1", "Lan", "09832", 20);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong("2", "Hưng", "098232", 23);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong("3", "Việt", "098132", 31);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong("4", "An", "091832", 25);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong("5", "Tuyết", "098432", 23);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong("6", "Mỹ", "092832", 31);
		objListNhanSu.them(ns);

		ns = new TruongPhong("8", "TP Mai", "098233", 24);
		objListNhanSu.them(ns);
		ns = new TruongPhong("9", "TP Luân", "091833", 21);
		objListNhanSu.them(ns);
		ns = new TruongPhong("10", "TP Kiệt", "091833", 23);
		objListNhanSu.them(ns);

		ns = new GiamDoc("11", "GD Tiến", "0981", 19, 80);
		objListNhanSu.them(ns);
		ns = new GiamDoc("12", "GD Huệ", "09181", 21, 20);
		objListNhanSu.them(ns);
	}

	/*
	 * Phân bổ nhân viên về phòng ban (Chỉ định trưởng phòng) B1: Duyệt ds và kiểm
	 * tra nếu là NhanVienThuong B2: Show danh sách trưởng phòng (Mã, tên) B3: Có
	 * muốn phân bổ không (Yes/No) B4: Nếu No, đi tiếp dến nhân viên tiếp theo B5:
	 * Nếu Yes, Yêu cầu nhập mã trưởng phòng đa liệt kê ở b2 B6: Kiểm tra mã nhập B5
	 * có nằm trong ds mã trương phòng b2 không B7: Nếu có: Láy trưởng phòng với mã
	 * đã chọn bước 5 -> Lấy ra object trưởng phòng B8: Gán trưởng phòng bước 7 cho
	 * trưởng phòng của nhân viên đang duyệt B9: Lặp lại bước 5 B10: Tăng số lượng
	 * nhân viên dưới quyền cho trưởng phòng đó
	 */

	public void phanBoNhanVienThuong() {
		Scanner scan = new Scanner(System.in);
		// B1
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof NhanVienThuong) {
				// B2
				// In ra thông báo tên và mã nhân viên thường để viết phân bổ
				System.out.println("Đang phân bổ cho nhân viên: ");
				ns.xuatMaVaTen();
				// phân bổ cho 1 nhân sự
				phanBoChoMotNhanSu(scan, ns);
				// end phân bổ cho 1 nhân sự
			}
		}
	}

	private void phanBoChoMotNhanSu(Scanner scan, NhanSu ns) {
		showMaVaTenTruongPhong();
		boolean flag = true;
		do {
			// B3
			System.out.println("Chọn 1 để phân bổ hoặc 2 để đi tiếp");
			int chon = Integer.parseInt(scan.nextLine());
			if (chon == 1 || chon == 2) {
				// B5
				if (chon == 1) {
					TruongPhong tp = chonTruongPhong(scan);
					// b7 đã có trưởng phòng lưu tại biến tp
					// b8
					((NhanVienThuong) ns).setTruongPhong(tp);
					// b10
					tp.tangNhanVien();
				}
				flag = false; // B4
			} else {
				System.out.println("Chỉ được nhập 1 hoặc 2");
				flag = true;
			}
		} while (flag);
	}

	private TruongPhong chonTruongPhong(Scanner scan) {
		TruongPhong tp = null;
		do {
			System.out.println("Vui lòng chọn mã trưởng phòng đã liệt kê trên: ");
			String chonMa = scan.nextLine();
			// B6
			tp = timTruongPhongTheoMa(chonMa);
		} while (tp == null);
		return tp;
	}

	private void showMaVaTenTruongPhong() {
		System.out.println("**********Danh sách trưởng phòng**********");
		ArrayList<TruongPhong> list = layDanhSachTruongPhong();
		for (TruongPhong tp : list) {
			tp.xuatMaVaTen();
		}
		System.out.println("==========================================");
	}

	public void lietKeDSTruongPhong() {
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				ns.xuatMaVaTen();
			}
		}
	}

	public TruongPhong timTruongPhongTheoMa(String ma) {
		TruongPhong tphong = null;
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				if (ns.getMaSo().compareTo(ma) == 0) {
					tphong = (TruongPhong) ns;
				}
			}
		}
		return tphong;
	}

	public ArrayList<TruongPhong> layDanhSachTruongPhong() {
		ArrayList<TruongPhong> list = new ArrayList<TruongPhong>();
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				list.add((TruongPhong) ns);
			}
		}
		return list;
	}

	public void themNhanSu(Scanner scan) {
		System.out.println("*********Chức năng thêm nhân sự*********");
		ArrayList<NhanVienThuong> list = this.objListNhanSu.nhap(scan);
		for (NhanVienThuong nvt : list) {
			phanBoChoMotNhanSu(scan, nvt);
		}
	}

	public boolean xoaNhanSu(Scanner scan) {
		boolean deleted = false; // chưa xóa
		System.out.println("**********Xóa nhân sự**********");
		System.out.println("Vui lòng nhập mã nhân sự cần xóa: ");
		String maXoa = scan.nextLine();
		NhanSu nhanSu = timNhanSuTheoMa(maXoa);
		if (nhanSu != null) { // tìm thấy và xử lý
			// Nếu trưởng phòng
			if (nhanSu instanceof TruongPhong) {
				deleted = xoaTruongPhong((TruongPhong) nhanSu);
			} else if (nhanSu instanceof NhanVienThuong) { // Nếu nhân viên thường
				deleted = xoaNhanVienThuong((NhanVienThuong) nhanSu);
			} else { // Nếu giám đốc
				this.objListNhanSu.getListNhanSu().remove(nhanSu);
			}

		} else {
			System.out.println("Mã nhân sự bạn vừa nhập không có trong danh sách!");
		}
		return deleted;
	}

	public NhanSu timNhanSuTheoMa(String ma) {
		NhanSu nhanSu = null; // chưa tìm thấy
		for (NhanSu ns : this.objListNhanSu.getListNhanSu()) {
			if (ns.getMaSo().equalsIgnoreCase(ma)) {
				nhanSu = ns;
				break;
			}
		}
		return nhanSu;
	}

	public boolean xoaTruongPhong(TruongPhong tp) {
		boolean deleted = false; // chưa xóa
		for (NhanSu ns : this.objListNhanSu.getListNhanSu()) {
			if (ns instanceof NhanVienThuong) {
				TruongPhong tPhongNVThuong = ((NhanVienThuong) ns).getTruongPhong();
				if (tPhongNVThuong != null) {
					if (tp.getMaSo().equalsIgnoreCase(tPhongNVThuong.getMaSo())) {
						((NhanVienThuong) ns).setTruongPhong(null);
						deleted = true; // xóa thành công
					}
				}
			}
		}
		this.objListNhanSu.getListNhanSu().remove(tp);
		return deleted;
	}

	public boolean xoaNhanVienThuong(NhanVienThuong nvt) {
		boolean deleted = false;
		TruongPhong tp = nvt.getTruongPhong();
		if (tp != null) {
			tp.giamNhanVien();
		}
		this.objListNhanSu.getListNhanSu().remove(nvt);
		deleted = true;
		return deleted;
	}

	public ArrayList<NhanVienThuong> lietKeDSNVTLuongCaoNhat() {
		ArrayList<NhanVienThuong> list = new ArrayList<NhanVienThuong>();
		// Tìm nhân viên thường đầu tiên trong ds nhân sự
		NhanVienThuong nvt = null;
		int indexMax = 0;
		for (NhanSu ns : this.objListNhanSu.getListNhanSu()) {
			indexMax++;
			if (ns instanceof NhanVienThuong) {
				nvt = (NhanVienThuong) ns;
				break;
			}
		}
		// Nếu có, thì cho nvt vừa tìm đc trong bc 1 là nvt có lương cao nhất
		if (nvt != null) {
			// Duyệt ds từ vị trí tìm đc ở b2 và tìm nvt có lương thực sự cao nhất
			for (int i = indexMax - 1; i < objListNhanSu.getListNhanSu().size(); i++) {
				NhanSu current = objListNhanSu.getListNhanSu().get(i);
				if (current instanceof NhanVienThuong) {
					if (current.getLuong() > nvt.getLuong()) {
						nvt = (NhanVienThuong) current;
						indexMax ++;
					}
				}
			}
			// Duyệt lại danh sách và so sánh lương của nvt vs nvt max thực sự 
			for(int i = indexMax - 1; i < objListNhanSu.getListNhanSu().size();i++) {
				NhanSu current = objListNhanSu.getListNhanSu().get(i);
				if (current instanceof NhanVienThuong) {
					if (current.getLuong() == nvt.getLuong()) {
						list.add(nvt);
					}
				}
			}
		}
		return list;
	}
	
	public void interchangeSort(ArrayList<NhanSu> list) {
		int i;
		int j;
		for(i=0; i < list.size()-1;i++) {
			for(j=i+1;j<list.size();j++) {
				NhanSu personI= list.get(i);
				NhanSu personJ = list.get(j);
				if(personJ.getHoTen().compareToIgnoreCase(personI.getHoTen()) < 0) {
					Collections.swap(list,i,j);
				}
			}
		}
	}
	public void sortName() {
		interchangeSort(this.objListNhanSu.getListNhanSu());
	}
}
