class Year 
{
	int year;
	int setYear()
	{
		year = 2024;
		return year;
	}
}
class LeapChecker extends Year
{
	int year = super.setYear();
	LeapChecker()
	{
		if(year%4==0 || year%100 == 0 || year%400==0)
		{
			System.out.print("Leap Year!!");
		}
		else
		{
			System.out.print("Not a Leap Year!!");
		}
	}
}

public class p2 
{
	public static void main(String arg[])
	{
		LeapChecker lc = new LeapChecker();
	}
}