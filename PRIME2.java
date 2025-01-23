import java.util.*;

class PRIME2
{
	public static void main(String args[])
	{
		int t=0,p=0; 
		for(int i=2;i<=1000;i++)
		{
			t=t-p;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					t=t+1;
					p=t;
				}
				else
					continue;
			}
		    if(t==2)
				System.out.print(i+",");
			//else
				//System.out.println("Given number is not prime");
		}
		System.out.println(" Is the prime numbers from 0 to X");
	}
}	