package assessment3;

import java.util.*;  
public class BouncyNumber  
{  
public static void main(String args[])   
{  
try (Scanner scan = new Scanner(System.in)) {
	System.out.print("Enter any number you want to check: ");  
	
	int num = scan.nextInt();    
	if (isIncreasing(num) || isDecreasing(num) || num < 101)  
	{
		System.out.println(num+" not a bouncy number.");  
	}
	else
	{
		System.out.println(num+" is a bouncy number.");
	}
}  
}   
public static boolean isIncreasing(int num)   
{    
	String str = Integer.toString(num);  
	char digit;    
	boolean flag = true;    
	for(int i=0;i < str.length()-1;i++)   
	{  
		digit = str.charAt(i);  
		if(digit > str.charAt(i+1))   
		{   
			flag = false;  
			break;  
		}      
	}  
	return flag;  
}  
public static boolean isDecreasing(int num)   
{  
	String str = Integer.toString(num);  
	char digit;  
	boolean flag = true;  
	for(int i=0;i < str.length()-1;i++)   
	{  
		digit = str.charAt(i);  
		if(digit < str.charAt(i+1))   
		{  
			flag = false;  
			break;  
		}      
	}  
	return flag;          
	}  
}