package methods;

import java.util.Scanner;

public class Question1 {

	public static void square(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.println(i*i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		square(n);
	}

}
