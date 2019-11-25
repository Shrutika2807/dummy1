interface A
{
	void m1();  

	
}
class B implements A
{
	public void m1()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your pin");
		Double pin = sc.Next();
		Double balance ;
		if(balance <= 0)
		{
			System.out.println("Your account balance is 0");
		}
		else
		{
			System.out.println(" Your Current Balance is" + balance);
		}
	}
}