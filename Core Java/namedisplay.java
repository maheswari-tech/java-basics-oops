class namecat
{
	String cat(String name)
	{
		String c = "Heloo "+name;
		return c;
	}
}
class namedisplay
{
	public static void main(String args[])
	{
		namecat n=new namecat();
		String y = n.cat("Maheswari");
		System.out.println(y);
	}
}