package methods;

import java.util.Scanner;

public class Question2 {
	
	public static double Area(double r)
	{
		return Math.PI*r*r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter radius");
		Scanner s=new Scanner(System.in);
		double radius=s.nextDouble();
		
		double area = Area(radius);
		System.out.println(area);
		

	}

}
