import java.util.*;
class fib
{
	public static void main(String args[])
	{
		Scanner  s=new Scanner(System.in);
		System.out.println("enter the value");
		int n=s.nextInt();
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<n;i++)
		{
			int c=a+b;
		    System.out.println(c);
			a=b;
			b=c;
		    
		}
		
	}
}