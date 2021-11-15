package selfProgramming;

public class LogicalOperationSlide19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int amount1 = 500;
		int balance = 950;
		int amount2 = 1200;
		
		if ((amount1 <= 1000.0) && (amount1 <= balance))
		{
			balance = balance - amount1;
			System.out.println("Acct new balance = RM "+ balance);
		}

		if ((amount2 >= 1000.0) && (amount2 >= balance))
		{
			System.out.println("You don't have sufficient balance in your acct");
		}
	}

}
