package inheritanceOOP;

class BankAccount 
{
	public void deposite()
	{
		System.out.println("deposited money is 100000..");
		System.out.println("BankAccount class And deposite Mathod executed........");
	}
	public void withdrawl()
	{
		System.out.println("withdrawl money is 100");
		System.out.println("BankAccount class And withdrawl Mathod executed........");
	}
}
 class SavingAccount extends BankAccount
{
	public void deposite()
	{
			System.out.println("the account balance falls below one hundred..");
			System.out.println("SavingAccount class And withdrawl Mathod executed........");
			super.withdrawl();
	}
}
public class SingleIneritanceBankDeposite 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SavingAccount d = new SavingAccount();
		System.out.println("Main Method executed. ");
		d.deposite();
		
		BankAccount b = new BankAccount();
		b.deposite();

	}

}
