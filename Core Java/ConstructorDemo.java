class MyClass
{
	void m1()
	{
		System.out.println("This is m1()");
	}
}
class Sample
{
	Sample()
	{
		System.out.println("This is Sample Constructor");
	}
	Sample(int z)
	{
		System.out.println("This is a parameterised constructor"+z);
	}
	Sample(MyClass u)
	{
		System.out.println("This is a Copy constructor");
		u.m1();
	}
}
class ConstructorDemo
{
	public static void main(String[] args) 
	{
		new Sample();
		MyClass x = new MyClass();
		x.m1();
	}
}
