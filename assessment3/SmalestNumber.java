package assessment3;

import java.util.Scanner;

public class SmalestNumber {

	public static void main(String[] args) {
		int a,b,c,smalest;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter a value:");
			a=sc.nextInt();
			System.out.println("enter b value:");
			b=sc.nextInt();
			System.out.println("enter c value:");
			c=sc.nextInt();
			smalest = (a<b && a<c)?a:((b<c)?b:c);
			System.out.println("Smalest number is:"+smalest);
		}

	}

}
