package dataStruct;

public class Main {

	public static void main(String[] args) {
		HashTable ht = new HashTable(5);
		
		ht.insertItem("da");
		ht.insertItem("ad");
		
		HashTable.Node node = ht.retrieveItem("da");
		System.out.println(node);
	}

}
