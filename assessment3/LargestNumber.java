package assessment3;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		int a,b,c;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter a value:");
			a=sc.nextInt();
			System.out.println("enter b value:");
			b=sc.nextInt();
			System.out.println("enter c value:");
			c=sc.nextInt();
			if(a>b && a>c)
			{
				System.out.println("a is greater number.");
			}
			else if(b>c)
			{
				System.out.println("b is greater number.");
			}
			else
			{
				System.out.println("c is greater number.");
			}
			
		}

	}

	
}
