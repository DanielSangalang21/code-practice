package DSProject;

public class Main {

	public static void main(String[] args) {
		HashTable ht = new HashTable();
		Student s1 = new Student("Daniel", "12", "3.4");
		Student s2 = new Student("Lei", "21", "3.1");
		Student s3 = new Student("Dan", "51", "6.1");
		Student s4 = new Student("Lei", "15", "5.1");
		
		int s1Key = ht.toHashCode(s1.getRollNo());
		int s2Key = ht.toHashCode(s2.getRollNo());
		int s3Key = ht.toHashCode(s3.getRollNo());
		int s4Key = ht.toHashCode(s4.getRollNo());
		
		ht.insert(s1Key, s1);
		ht.insert(s2Key, s2);
		ht.insert(s3Key, s3);
		ht.insert(s4Key, s4);
		ht.showData();
		System.out.println();
		ht.delete("15");
		
		Student copy = ht.fetchStud("21");
		if(copy.equals(s2)) {
			System.out.println(ht.fetchStud("21")+"\n");
		}
		ht.showData();
		System.out.println(	ht.getCount());
	//	ht.showData();
	}

}
