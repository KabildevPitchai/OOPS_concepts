package gettersetter;
public class Customer
{
	public static void main(String[] args)
	{
		Bank customer=new Bank();
		customer.setBalance(10_000);
		System.out.println(customer.getBalance());
		
		customer.setAcc_num(12934);
		System.out.println(customer.getAcc_num());
		
		Bank customer2=new Bank();
		customer2.setBalance(7000);
		System.out.println(customer2.getBalance());
		
		customer.setAcc_num(13527);
		System.out.println(customer.getAcc_num());
		
		
	}
}