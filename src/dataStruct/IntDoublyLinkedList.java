package dataStruct;

public class IntDoublyLinkedList {
	Node head;
	
	public IntDoublyLinkedList(int item) {
		head = new Node();
		head.value = item;
		head.prev = null;
		head.next = null;
	}
	
	@SuppressWarnings("unused")
	public Boolean insertBefore(int item,int valueIndex) {
		Node n = head;
		while ( n != null && n.value != valueIndex) {
			n = n.next;
		}
		if (n!= null) {
			Node newNode  = new Node();
			if(n == head) {
				head = newNode;
			}
			newNode.value = item;
			newNode.prev = n.prev;
			newNode.next = n;
			n.prev.next = newNode;
			n.prev = newNode;
			return true;
		}
		return false;
	}
	
	public Boolean insertNode(int item) {
		Node n = new Node();
		n.value = item;
		n.next = head;
		head.prev = n;
		head = n;
		return true;
	}
	public Boolean insertEndNode(int item) {
		Node z = head;
		while (z != null) {
			System.out.println(z.value);
			z = z.next;
		}
		return true;
	}
	
	public void printList() {
		Node z = head;
		while (z != null) {
			System.out.println(z.value);
			z = z.next;
		}
	}
	
	class Node{
		private Node prev,next;
		private int value;
	}
}
