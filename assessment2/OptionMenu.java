package miniproject1;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class OptionMenu extends Account {
	Scanner sc = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
	public void getlogin() throws IOException
	{
		int x = 1;
		do
		{
			try {
				data.put(9876543,9376);
				data.put(9876553,7693);
				data.put(9876563,9673);
				System.out.println("welcome to the ATM project!");
				
				System.out.println("Enter your customer number:");
				setCustomerNumber(sc.nextInt());
				
				System.out.println("Enter your pin Number:");
				setPinNumber(sc.nextInt());
				
			}
			catch(Exception e)
			{
				System.out.println("\n" + "Invalid character(s). only numbers." + "\n");
				x=2;
			}
			for(Entry<Integer,Integer> entry : data.entrySet())
			{
				if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber())
				{
					getAccountType();
				}
			}
			System.out.println("\n"+ "wrong customer number or pin number." + "\n");
			
		}while(x==1);
		
	}
	public void getAccountType()
	{
		System.out.println("select the account you want to access:");
		System.out.println("Type 1 - checking Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		System.out.println("choice:");
		selection = sc.nextInt();
		switch(selection)
		{
			case 1 :
				getChecking();
				break;
			case 2:
				getSaving();
				break;
			case 3:
				System.out.println("\n" + "Thanks for using this ATM,bye.");
				break;
			default:
				System.out.println("\n" + "Invalid choice." + "\n");
				getAccountType();
		}
	
	}
	public void getChecking()
	{
		System.out.println("checking Account");
		System.out.println("Type 1 - view Balance");
		System.out.println("Type 2 - withdraw funds");
		System.out.println("Type 3 - deposit finds");
		System.out.println("Type 4 - exit");
		System.out.println("choice:");
		selection = sc.nextInt();
		switch(selection)
		{
			case 1 :
				System.out.println("checking account balance:" + moneyFormat.format(getCheckingBalance()));
				getAccountType();
				break;
			case 2:
				getCheckingWithdrawInput();
				getAccountType();
				break;
			case 3:
				getCheckingDepositInput();
				getAccountType();
				break;
			case 4:
				System.out.println("\n" + "Thanks for using this ATM,bye.");
				break;
			default:
				System.out.println("\n" + "Invalid choice." + "\n");
				getChecking();
		}
	}
	public void getSaving()
	{
		System.out.println("Saving Account");
		System.out.println("Type 1 - view Balance");
		System.out.println("Type 2 - withdraw funds");
		System.out.println("Type 3 - deposit finds");
		System.out.println("Type 4 - exit");
		System.out.println("choice:");
		selection = sc.nextInt();
		switch(selection)
		{
			case 1 :
			System.out.println("checking account balance:" + moneyFormat.format(getSavingBalance()));
				getAccountType();
				break;
			case 2:
				getSavingWithdrawInput();
				getAccountType();
				break;
			case 3:
				getSavingDepositInput();
				getAccountType();
				break;
			case 4:
				System.out.println("\n" + "Thanks for using this ATM,bye.");
				break;
			default:
				System.out.println("\n" + "Invalid choice." + "\n");
				getSaving();
		}
	}
	int selection;
	
	
}