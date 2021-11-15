package selfProgramming;

public class LogicalOperatorsSlide16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int income1 = 7000;
		int income2 = 1000;
		int MIN_LEVEL = 3000;
		int age1 = 30;
		int age2 = 60;
		
		if ((income1 > MIN_LEVEL) && (age1 < 50))
			System.out.println("Can Apply Loan");
		
		if ((income2 < MIN_LEVEL) && (age2 > 50))
			System.out.println("Cannot Apply for loan");
		
		if ((income1 >= MIN_LEVEL) || (age2 > 50));
			System.out.println("Can Apply Loan");
		

	}

}
