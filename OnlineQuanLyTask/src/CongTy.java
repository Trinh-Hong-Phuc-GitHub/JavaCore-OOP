import java.util.ArrayList;
import java.util.Scanner;

public class CongTy implements NhapXuat {

	private String tenCongTy;
	private String maSoThue;
	private float tongLuong;
	private DanhSachNhanSu objDSNhanSu;
	private DanhSachPhongBan objDSPhongBan;
	private DanhSachTask objDSTask;
	private ArrayList<TruongPhong> dsTruongPhong;

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

	public DanhSachNhanSu getObjDSNhanSu() {
		return objDSNhanSu;
	}

	public void setObjDSNhanSu(DanhSachNhanSu objDSNhanSu) {
		this.objDSNhanSu = objDSNhanSu;
	}

	public DanhSachPhongBan getObjDSPhongBan() {
		return objDSPhongBan;
	}

	public void setObjDSPhongBan(DanhSachPhongBan objDSPhongBan) {
		this.objDSPhongBan = objDSPhongBan;
	}

	public DanhSachTask getObjDSTask() {
		return objDSTask;
	}

	public void setObjDSTask(DanhSachTask objDSTask) {
		this.objDSTask = objDSTask;
	}

	public float getTongLuong() {
		return tongLuong;
	}

	public CongTy() {
		// TODO Auto-generated constructor stub
		dsTruongPhong = new ArrayList<TruongPhong>();
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub

	}

	public void xuatDSNS() {
		this.objDSNhanSu.xuat();
	}

	public void xuatDSTask() {
		this.objDSTask.xuat();
	}

	public void xuatDSPhongBan() {
		this.objDSPhongBan.xuat();
	}

	public void taoDuLieu() {
		this.objDSNhanSu = new DanhSachNhanSu();
		this.objDSNhanSu.taoDuLieu();

		this.objDSPhongBan = new DanhSachPhongBan();
		this.objDSPhongBan.taoDuLieu();

		this.objDSTask = new DanhSachTask();
		this.objDSTask.taoDuLieu();

		this.layDanhSachTruongPhong();
	}

	public void phanBoNhanVien() {
		Scanner scan = new Scanner(System.in);
		// Duyệt danh sách nhân viên
		// Liệt kê danh sách phòng ban
		// Hỏi muốn phân bổ không, 1: Phân bổ -> Nhập vào mã phòng ban, 2 đi tiếp k phân
		// bổ
		for (NhanSu ns : this.objDSNhanSu.getListNhanSu()) {
			if (ns instanceof NhanVienThuong) {
				boolean flag = true;
				do {
					System.out.println("Đang phân bổ cho nhân viên");
					ns.xuatTenVaMa();
					System.out.println("Chọn 1 để phân bổ, 2 để đi tiếp");
					int chon = Integer.parseInt(scan.nextLine());
					switch (chon) {
					case 1:
						System.out.println("Đây là danh sách phòng ban");
						xuatDSPhongBan();
						System.out.println("Mời chọn: ");
						String maPhong = scan.nextLine();
						// Thêm ns vào dsns phòng ban
						// gán pb cho ns này
						// Lấy phòng ban tương ứng người dùng nhập
						PhongBan pb = layPhongBan(maPhong);
						if (pb != null) {
							// Gán mã phòng ban cho nhân sự này
							ns.setMaPhongBan(maPhong);
							// thêm ns này vào ds nhân sự của phòng ban
							pb.getDsNhanVien().add((NhanVienThuong) ns);
						}
						flag = false;
						break;
					case 2:
						flag = false;
						break;
					default:
						System.out.println("Chỉ chọn 1 hoặc 2");
					}
				} while (flag);
			}
		}
	}

	private PhongBan layPhongBan(String maPhong) {
		for (PhongBan pb : this.objDSPhongBan.getListPhongBan()) {
			if (pb.getMaPhongBan().equalsIgnoreCase(maPhong)) {
				return pb;
			}
		}
		return null;
	}

	public void layDanhSachTruongPhong() {
		for (NhanSu ns : this.objDSNhanSu.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				this.dsTruongPhong.add((TruongPhong) ns);
			}
		}
	}

	public void chiDinhTruongPhong() {
		Scanner scan = new Scanner(System.in);
		// Duyệt danh sách tp
		// Liệt kê danh sách phòng ban
		// Hỏi muốn cđ không, 1: cđ -> Nhập vào mã phòng ban, 2 đi tiếp k phân
		// bổ
		for (TruongPhong tp : this.dsTruongPhong) {
			boolean flag = true;
			do {
				System.out.println("Đang chỉ định cho trưởng phòng");
				tp.xuatTenVaMa();
				System.out.println("Chọn 1 để chỉ định, 2 để đi tiếp");
				int chon = Integer.parseInt(scan.nextLine());
				switch (chon) {
				case 1:
					System.out.println("Đây là danh sách phòng ban");
					xuatDSPhongBan();
					System.out.println("Mời chọn: ");
					String maPhong = scan.nextLine();
					// Thêm ns vào dsns phòng ban
					// gán pb cho ns này
					// Lấy phòng ban tương ứng người dùng nhập
					PhongBan pb = layPhongBan(maPhong);
					if (pb != null) {
						// Gán mã phòng ban cho nhân sự này
						tp.setMaPhongBan(maPhong);
						// chỉ định trưởng phòng về pb
						pb.setTruongPhong(tp);
					}
					flag = false;
					break;
				case 2:
					flag = false;
					break;
				default:
					System.out.println("Chỉ chọn 1 hoặc 2");
				}
			} while (flag);
		}
	}

	// Bước 1: Duyệt danh sách task
	// Bước 2: Cho phép người dùng nhập vào nhân sự theo mã, nhập cho đến khi nào có
	// đúng 1 nhân sự
	// Bước 3: Phân task hoặc cho chọn lại hoặc bỏ qua task
	public void phanTask() {
		Scanner scan = new Scanner(System.in);
		for (Task task : objDSTask.getListTask()) {
			System.out.println("Task đang phân bổ:");
			task.xuat();
			NhanSu ns = timNhanSuTheoMa(scan);
			boolean flag = true;
			do {
				System.out.println(
						"Chọn 1: Phân Task cho nhân sự này. 2: Chọn lại nhân sự khác. 3: Bỏ qua không phân Task này");
				int chon = Integer.parseInt(scan.nextLine());
				switch (chon) {
				case 1:
					task.setMaNV(ns.getMaNV());// Gán mã nhân viên thực hiện task
					ns.getObjDSTask().getListTask().add(task);// Thêm task vào danh sách task của nhân sự
					System.out.println("Phân task thành công!");
					flag = false;
					break;
				case 2:
					ns = timNhanSuTheoMa(scan);
					break;
				case 3:
					flag = false;
					break;
				default:
					System.out.println("Vui lòng chọn 1 - 3 mà thôi!");
				}
			} while (flag);
		}
	}

	public NhanSu timNhanSuTheoMa(Scanner scan) {
		NhanSu ns = null;
		do {
			System.out.println("Nhập vào mã nhân sự để chỉ định task:");
			String ma = scan.nextLine();
			for (NhanSu nSu : this.objDSNhanSu.getListNhanSu()) {
				if (nSu.getMaNV().equalsIgnoreCase(ma)) {
					ns = nSu;
					System.out.println("Nhân sự bạn đang chọn là: ");
					ns.xuatTenVaMa();
					break;
				}
			}
		} while (ns == null);
		return ns;
	}
}
