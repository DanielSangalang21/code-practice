package dataStruct;

public class IntLinkedList {
	private Node head;
	
	public IntLinkedList() {
		head = new Node();
		head.value = 0;
		head.link = null;
	}
	
	public boolean insertNode(int item) {
		Node n = new Node();
		n.value = item;
		/*
		 * n.link = head; head = n;
		 */
		Node y = head;
		while (y.link !=null) {
			y = y.link;
		}
		y.link = n;
		return true;
	}
	
	public boolean deleteItem(int item) {
		if(head.value == item) {
			head = head.link;
			return true;
		}else {
			Node x = head;// will contain the preceding node
			Node y = head.link;// will contain the found node with the given element
			
			while(true) {
				if(y == null || y.value == item) {
					break;
				}else {
					x = y;
					y = y.link;
				}
			}
			
			if(y != null) {
				x.link = y.link;
				return true;
			}else {
				return false;
			}
		}
		
	}
	
	public void printList() {
		Node z = head.link;
		while (z!=null) {
			System.out.println(z.value);
			z = z.link;
		}
	}
	
	public void sortList() {
		Node y = head.link;
		
		while (y.link != null) {
			Node x = head.link;
			while (x.link != null) {
				if(x.value > x.link.value) {
					int temp =  x.value;
					x.value = x.link.value;
					x.link.value = temp;
				}
				x = x.link;
			}
			y = y.link;
		}
		
		
	}
	
	class Node{
		private int value;
		private Node link;
	}
}
