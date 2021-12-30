package assessment3;
import java.util.Scanner;
public class EvenNumbers 
{  
	public static void main(String[] args)   
	{  
	int number, i;  
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter the limit: ");  
		number = sc.nextInt();
	}  
	i=2;   
	System.out.print("List of even numbers: \n");  
	while(i<=number)  
	{  
		System.out.print(i +" ");   
		i=i+2;  
	}     
	}  
	 
}
