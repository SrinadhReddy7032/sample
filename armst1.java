
//import java.util.*;
class armst1
{
	public static void main(String args[])
	{
		/*Scanner  s=new Scanner(System.in);
		System.out.println("enter the value");
		int x=s.nextInt();*/
		int p,b,t=0,r=0;
		//int x=1;
		for(int x=1;x<=1000;x++)
		{
			t=t-r;
			for(int j=x;j>=1;j=p)
			{
				p=j/10;
				b=j%10;
				t=t+(b*b*b);
				r=t;
				
			}
			//r=t;
			if (x==r)
			{
				System.out.println(x);
			}	
		}
	}
}