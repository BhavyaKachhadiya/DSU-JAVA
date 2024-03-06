class Subclass
{
	int a = 10;
	void printInt()
	{
		System.out.print(a);	
	}
}

class Subclass2 extends Subclass
{
	public void print()
	{
		super.printInt();
	}
}

public class p1 
{
	public static void main(String args[])
	{
		Subclass2 a = new Subclass2();
		a.print();
	}
}