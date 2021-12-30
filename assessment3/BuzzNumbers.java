package assessment3;

import java.util.Scanner;

public class BuzzNumbers {

	public static void main(String[] args) {
		int num;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter a number:");
			num=sc.nextInt();
		}
		 if(num % 10 == 7 || num % 7 == 0)  
		{
			System.out.println(num+"is a buzz nuimber.");
		}
		else
		{
			System.out.println(num+"is not a buzz nuimber.");
		}
		

	}

}
