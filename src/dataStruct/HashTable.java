package dataStruct;

public class HashTable {
	Node[] ht;
	
	public HashTable(int size) {
		ht = new Node[size];
	}
	
	
	public boolean insertItem(String item) {
		
		int value = 0;
		for (int i = 0; i < item.length(); i++) {
			value += item.charAt(i);		 
		}
		int index = value %  ht.length;
		if(ht[index] == null) {
			Node head = new Node();
			head.value = item;
			ht[index] = head;
		}else {
			Node head = ht[index];
			Node n = new Node();
			n.value = item;
			n.link = head;
			ht[index] = n;
		}
		return true;
	}
	
	//for checking only if we can retrieve
	public Node retrieveItem(String item) {
		int value = 0;
		for (int i = 0; i < item.length(); i++) {
			value += item.charAt(i);
		}
		int index = value % ht.length;

		if (ht[index] == null) {
			return null;
		} else {
			Node head = ht[index];
			while (head != null) {
				if (head.value.equals(item)) {
					return head;
				}
				head = head.link;
			}
			return head;
		}
	}
	
	class Node{
		private String value;
		private Node link;
	}
}
