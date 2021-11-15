package selfProgramming;

public class BlockStatementSlide24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int amount = 6000;
		int balance = 5675;
		int OVERDRAFT_PENALTY = 50;
		
		if (amount <= balance)
		{
			balance = balance - amount;
			System.out.println("Acct new balance = "+balance);
		}
		
		else 
		{
			balance = balance - OVERDRAFT_PENALTY;
			System.out.println("TRANSACTION NOT ALLOWED");
		}
		
	}

}
