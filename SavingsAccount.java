package foueone;

public class SavingsAccount extends Account {
	final int minimumblc=500;

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		super.withdraw(amount);
		if(minimumblc>500)
		{
			System.out.println("you have withdraw rupees"+ (amount));
		}
		else
		{
			System.out.println("withdraw failed ");
		}
		
	}
	
	
	

}
