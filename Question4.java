package methods;

import java.util.Scanner;

public class Question4 {
	
	public static void countPrint(int digit)
	{
		int count=0;
		while(digit!=0)
		{
			int temp=digit%10;
			count++;
			digit/=10;
		}
		System.out.println("Square of digit is "+ count*count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter digits");
		Scanner s=new Scanner(System.in);
		
		int digit=s.nextInt();
		
		countPrint(digit);
		

	}

}
