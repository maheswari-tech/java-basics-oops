class First
{
	void main(int a,int b)
	{
		int c = a+b;
		System.out.println("The Result is :"+c);
	}
}
class Addition
{
	First add()
	{
		First x = new First();
		return x;
	}
}
class ReturnObj
{
	public static void main(String [] args)
	{
		Addition y = new Addition();
		First c = y.add();
		c.main(857,988);
	}
}