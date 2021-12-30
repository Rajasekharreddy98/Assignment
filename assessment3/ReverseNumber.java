package assessment3;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		int num,rev=0,rem;
         try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter a number:");
			 num = sc.nextInt();
		}
         while(num!=0)
         {
        	 rem = num % 10;
        	 rev = rev*10+rem;
        	 num=num/10;
        	 
         }
         System.out.println("reverse of a the given number is:\n"+rev);
         
         
	}

}
