class print
{
	void m1()
	{
		System.out.println("This is m1()");
	}
}
class object
{
	void m2(print g)
	{
		g.m1();

	}
}
class main
{
	public static void main(String args[])
	{
		print x = new print();
		object y = new object();
		y.m2(x);
	}
}