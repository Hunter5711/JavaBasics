class BankAccount	{
	double amount1;
	private double balance; // account balance
	char ch;
	public BankAccount(double openingBalance) // constructor
	{
		balance = openingBalance;
	}
	public void deposit(double amount) // makes deposit
	{
		balance = balance + amount;
		try {
	  ch=(char) System.in.read();
		amount1 = Character.getNumericValue(ch);
		System.out.println( + amount1);
	  }
	  catch (Exception e){
		  System.out.println(e);
	  }
	}
	public void withdraw(double amount) // makes withdrawal
	{
		balance = balance - amount;
	}
	

	public static void main (String [] args )
	{
		BankAccount account= new BankAccount(1000);
		
		account.deposit(1000);
		
		System.out.println("Balance after deposition =" + account.balance);
		account.withdraw(500);
		System.out.println("Balance after withdrawal =" + account.balance);

	}
}