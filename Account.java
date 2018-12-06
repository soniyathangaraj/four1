package foueone;

public class Account {

	
		public long accno;
		public double balance=500;
		public Person accholder;
		
		public Person getAccholder() {
			return accholder;
		}
		public void setAccholder(Person accholder) {
			this.accholder = accholder;
		}
		
		public long getAccno() {
			return accno;
		}
		public void setAccno(long accno) {
			this.accno = accno;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		void deposit(double amount)
		{
			balance+=amount;
		}
		void withdraw(double amount)
		{
			balance-=amount;
		}
		public Account() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Account(long accno, double balance, Person accholder) {
			super();
			this.accno = accno;
			this.balance = balance;
			this.accholder = accholder;
		}
		@Override
		public String toString() {
			return "Account [accno=" + accno + ", balance=" + balance + "]";
		}
		
	
	}


