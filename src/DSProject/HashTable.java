package DSProject;

public class HashTable {
	private StdList[] arr;
	private int size;
	private int totalStudents;
	
	public HashTable() {
		this.size = 10;
		this.arr = new StdList[size];
	}
	
	public int toHashCode(String rollNo) {
		int value = 0;
		for (int i = 0; i < rollNo.length(); i++) {
			value += rollNo.charAt(i);
		}
		return value % arr.length;
	}
	
	public boolean insert(int key, Student data) {
		if (arr[key] == null) {
			arr[key] = new StdList();
		}
		arr[key].insertStd(data);
		totalStudents++;
		return true;
	}
	
	public boolean delete(String rollNo) {
		int key = toHashCode(rollNo);
		if (arr[key].fetchData(rollNo) != null) {
			arr[toHashCode(rollNo)].deleteStudent(rollNo);
			totalStudents--;
			return true;
		} else {
			return false;
		}
	}
	
	public int getCount() {
		return totalStudents;
	}
	public void showData() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				arr[i].showAll();
			}
		}
	}
	
	public Student fetchStud(String rollNo) {
		int key = toHashCode(rollNo);
		if (arr[key] != null) {
			return arr[key].fetchData(rollNo);
		}
		return null;
	}
}
