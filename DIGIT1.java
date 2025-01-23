import java.util.*;

class DIGIT1
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter any value");
		int X=s.nextInt();
		int k=0;
		int p=0;
		for(;X>=10;X=p)
		{
			p=X/10;
			X=X%10;
			k=k+X;
			//System.out.print(k);
		}
        System.out.println(k+X);		
		
	}
}	
		
		
		