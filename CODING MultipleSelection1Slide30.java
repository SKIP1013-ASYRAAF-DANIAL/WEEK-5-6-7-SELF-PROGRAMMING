package selfProgramming;

public class MultipleSelection1Slide30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mark = 70;
		char grade;
		
		
		if (mark >= 90)
			grade = 'A';
		else if (mark >= 80)
			grade = 'B';
		else if (mark >= 70)
			grade = 'C';
		else if (mark >= 60)
			grade = 'D';
		else 
			grade = 'F';
		
		System.out.println("Your mark is "+mark);
		System.out.println("Your grade is "+grade);
		

		
	}




}
