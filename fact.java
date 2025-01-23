import java.util.*;
class fact
{
	public static void main(String args[])
	{
		Scanner  s=new Scanner(System.in);
		System.out.println("enter the value");
		int n=s.nextInt();
		int t=1;
		while(n>=1)
		{
			t=t*n--;	
		}
		System.out.println("This is the fact given value=");
		System.out.print(t);
	}
}