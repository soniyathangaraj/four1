package foueone;

public class CurrentAccount extends Account {
	
	int overdraftlimit;

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		super.withdraw(amount);
		if(overdraftlimit==balance)
		{
			System.out.println("you have reached the maximum limit");
	   }
	}
}
