import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ListPerson {

	private ArrayList<Person> list;

	public ArrayList<Person> getList() {
		return list;
	}

	public void setList(ArrayList<Person> list) {
		this.list = list;
	}

	public ListPerson() {
		list = new ArrayList<Person>();
	}

	private void inMenu() {
		System.out.println("Vui lòng chọn theo menu");
		System.out.println("1. Nhập student");
		System.out.println("2. Nhập employee");
		System.out.println("3. Nhập customer");
		System.out.println("0. Thoát");
	}

	public void nhap(Scanner scan) {
		boolean flag = true;
		do {
			inMenu();
			System.out.println("Mời chọn: ");
			Person person;
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				person = new Student();
				person.nhap(scan);
				list.add(person);
				break;
			case 2:
				person = new Employee();
				person.nhap(scan);
				list.add(person);
				break;
			case 3:
				person = new Customer();
				person.nhap(scan);
				list.add(person);
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Nhập từ 0 đến 3!");
			}
		} while (flag);
	}

	public void xuat() {
		for (Person person : list) {
			person.xuat();
		}
	}

	public void xoa1NguoiTheoMa(String ma) {
	    for (int i = 0; i < list.size(); i++) {
	        if (list.get(i).getMa().equalsIgnoreCase(ma)) {
	            list.remove(i);
	        }
	    }
	}

	public void interchangeSort(ArrayList<Person> list) {
		int i;
		int j;
		for(i=0; i < list.size()-1;i++) {
			for(j=i+1;j<list.size();j++) {
				Person personI= list.get(i);
				Person personJ = list.get(j);
				if(personJ.getHoTen().compareToIgnoreCase(personI.getHoTen()) < 0) {
					Collections.swap(list,i,j);
				}
			}
		}
	}
	
	public void sortName() {
		interchangeSort(this.list);
	}
}
