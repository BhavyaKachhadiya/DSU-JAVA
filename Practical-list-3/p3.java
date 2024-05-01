interface Hello
{
	public void display();
}
class Interface implements Hello
{
	public void display()
	{
		System.out.println("Hello World");
	}
	
}
class p3
{
	public static void main(String args[])
	{
		Interface i = new Interface();
		i.display();	
	}
}