package selfProgramming;

public class IfElseStatementSlide23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int balance = 500;
		int amount = 250;
		int OVERDRAFT_PENALTY = 50;
		
		if (amount <= balance) 
		{
			balance = balance - amount;
			System.out.println(balance);
		}
		
		else
		{
			balance = balance - OVERDRAFT_PENALTY;
			System.out.println(balance);
		}

	}

}
