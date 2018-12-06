package foueone;

public class PersonMain {
	
  public static int id=100;
  public static int  generateid()
  {
	  return ++id;
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		Person p1=new Person();
		p.setName("soni");
		p.setBalance(2000);
		p1.setName("shalu");
		p1.setBalance(3000);
		p.setAccno(66);
		p1.setAccno(67);
		p.deposit(2000);
		p1.withdraw(2000);
		System.out.println("balance of " +"   "+p.getName()+"   "+p.getBalance());
		System.out.println("balance of"  +"    "+ p1.getName()+"  "+p1.getBalance() );
		System.out.println(p.toString());
		System.out.println(p1.toString());

	}

}
