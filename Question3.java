package methods;

import java.util.Scanner;

public class Question3 {
	
	public static void printOdd(int a, int b)
	{
		
		if(a>b)
		{
			for(int i=b+1;i<a;i++)
			{
				if(i%2!=0)
				{
					System.out.print(i+" ");
				}
			}
		}else
		{
			for(int i=a+1;i<b;i++)
			{
				if(i%2!=0)
				{
					System.out.print(i+" ");
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter value for a and b");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		printOdd(a, b);
		
	}
}
