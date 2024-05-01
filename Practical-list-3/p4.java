class Overridding
{
	void add(int a,int b)
	{
		System.out.println("Add: "+(a+b));
	}
}

class Overridding2 extends Overridding
{
	void add(int a,int b,int c)
	{
		System.out.println("Add: "+(a+b+c));
	}
}

class p4
{
	public static void main(String args[])
	{
		Overridding2 or2 = new Overridding2();
		or2.add(2,3);
		or2.add(2,3,5);
	}
}