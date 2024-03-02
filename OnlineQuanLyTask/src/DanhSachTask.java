import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DanhSachTask implements NhapXuat{
	private ArrayList<Task> listTask;

	public ArrayList<Task> getListTask() {
		return listTask;
	}

	public void setListTask(ArrayList<Task> listTask) {
		this.listTask = listTask;
	}
	
	public DanhSachTask() {
		// TODO Auto-generated constructor stub
		this.listTask = new ArrayList<Task>();
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		for(Task task: this.listTask) {
			task.xuat();
		}
	}

	public void taoDuLieu() {
		try {
			FileReader reader = new FileReader("src/Task.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] listInfo = line.split(" # ");
				Task task = new Task(listInfo[0], listInfo[1], Float.parseFloat(listInfo[2]));
				//Thêm nhân sự vào list
				this.listTask.add(task);
			}
			reader.close();// Đóng tập tin
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
