package selfProgramming;

public class BlockStatementsSlide15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int amount = 500;
		int balance = 2000;
		
		if (amount <= balance) // in block statement
		{
			balance = balance - amount;
			System.out.println("Acct new balance = " + balance);
		}
		
		if (amount <= balance) // not in block statement
		
			balance = balance - amount;
			System.out.println("Acct new balance = " + balance);

	}

}
