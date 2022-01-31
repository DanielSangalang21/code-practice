package DSProject;

public class StdList {
	private Node h;

	public StdList() {
		h = new Node();
		h.data = null;
		h.next = null;
	}

	public boolean insertStd(Student std) {
		Node n = new Node();
		n.data = std;
		n.next = h;
		h = n;
		return true;
	}

	public boolean haveRollNo(String rollNo) {
		Node a = h;
		while (a.next != null) {
			if (rollNo.equals(a.data.getRollNo())) {
				return true;
			}
			a = a.next;
		}
		return false;
	}

	public Student fetchData(String rollNo) {
		Node a = h;
		while (a.next != null) {
			if (rollNo.equals(a.data.getRollNo())) {
				return a.data;
			}
			a = a.next;
		}
		return null;
	}
	
	public void showAll() {
		Node n = h;
		while (n.next != null) {
			System.out.println(n.data);
			n= n.next;
		}
	}

	public void deleteStudent(String rollNo) {
		Node a = h;
		if(rollNo.equals(h.data.getRollNo())) {
			h = a.next;
			return;
		}
		Node q = h;
		while (q.next != null && !rollNo.equals(q.data.getRollNo())) {
			a = q;
			q = q.next;
		}
		if(q != null) {
			a.next = q.next;
		}
	}

	class Node {
		private Student data;
		private Node next;
	}
}
