import java.util.Arrays;
import java.util.List;

public class HackerlandGradingSytem {

	public static void main(String[] args) {
		List<Integer> grades = Arrays.asList(38,37,40,43,72);
		List<Integer> finalGrades = gradingStudents(grades);
		
		finalGrades.stream().forEach((grade) -> System.out.println(grade));
//System.out.println();
//System.out.print(34%5);
	}
	
	  public static List<Integer> gradingStudents(List<Integer> grades) {
		
		int count = 0;
		for(int grade : grades) {
			if(grade<38) {
				count++; 
				continue;
			}
			else if((grade%10 >= 3 && grade%10 <= 5) || grade%10 >= 8) {
				while (grade % 5 != 0) 
				{grade = grade+=1;}
				grades.set(count, grade);
			} count++; 
		}return grades;	
	  }

}
