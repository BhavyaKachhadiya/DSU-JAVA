class A
{
	A()
	{
		System.out.println("Class A");
	}
}

class B extends A
{
	B()  
	{
		System.out.println("class B");
	}
}

class C extends B
{
	C()
	{
		System.out.print("class C");
	}
}

class p5
{
	public static void main(String arg[])
	{
		C c = new C();
	}
}