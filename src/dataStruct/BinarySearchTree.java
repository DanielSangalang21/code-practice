package dataStruct;

public class BinarySearchTree {
	Node root;

	public BinarySearchTree() {
		root = null;
	}

	public Boolean insert(Person item) {
		Node n = new Node();
		n.data = item;
		n.leftChild = null;
		n.rightChild = null;

		if (root == null) {
			root = n;
			return true;
		}

		Node c = root;
		Node p = root;
		while (c != null) {
			p = c;
			if (item.getName().compareTo(c.data.getName()) < 0) {
				c = c.leftChild;
			} else {
				c = c.rightChild;
			}
		}

		if (item.getName().compareTo(p.data.getName()) < 0) {
			p.leftChild = n;
		} else {
			p.rightChild = n;
		}
		return true;
	}

	public void showAll(Node n) {
		Node p = n;
		if(p != null) {
			System.out.println(p.data.toString());
			showAll(p.leftChild);
			showAll(p.rightChild);
		}
	}
	
	public Node findNode(String key) {
		Node p = root;
		while (p != null) {
			String nodeName =  p.data.getName();
			if(key.compareTo(nodeName) == 0) {
				return p;
			}if (key.compareTo(nodeName) < 0) {
				p = p.leftChild;
			}else if (key.compareTo(nodeName) > 0)  {
				p = p.rightChild;
			}
		}
		return null;
	}
	
	public Node findParent(String key) {
		Node p = root;
		Node c = root;
		do {
			if (key.compareTo(c.data.getName()) == 0) {
				break;
			}
			p = c;
			if (key.compareTo(c.data.getName()) < 0) {
				c = c.leftChild;
			} else {
				c = c.rightChild;
			}
		} while (c != null);
		return p;
	}

	class Node {
		Node leftChild;
		Person data;
		Node rightChild;
	}
}
