import java.util.Scanner;
public class BankingApplication 
{
	public static void main(String args[])
	{
		Bank obj1= new Bank("ABC", 123, 6589, "abhy7", "Savings", 76589);
		obj1.customer_details();
	}
}

class Bank
{
	int amt;
	int balance;
	int balance1;
	int balance2;
	int transaction;
	String customer_name;
	int customer_id;
	int account_no;
	int mobile_no;
	String branch;
	String account_type;
	
	
	Bank(String customer_name, int customer_id, int mobile_no, String branch, String account_type, int account_no )
	{
		this.customer_name=customer_name;
		this.customer_id=customer_id;
		this.mobile_no=mobile_no;
		this.branch=branch;
		this.account_type=account_type;
		this.account_no= account_no;
	}
	
	void deposit(int amt)
	{
		if(amt!=0)
		{
			balance=balance+amt;							
			transaction=amt;
		}
	}
	void withdrawl(int amt1) 
	{
		if(amt1!=0)
		{
			balance=balance-amt1;							
			transaction=amt1;
		
		}
	}
	void transaction()
	{
		int amt1 = 0;
		if (transaction==amt)
		{
			System.out.print("Deposited:" + transaction);
		}
		else if(transaction==amt1)
		{
			System.out.print("Withdrawn:" + transaction);
		}
		else
		{
			System.out.print("No transcactions performed");
		}
	
	}
	
	void customer_details() 
	{
		int number;
		Scanner scanner= new Scanner(System.in);
		
		
	   
		System.out.println("Welcome" +" "+ customer_name);
		System.out.println("Your id:"+" "+ customer_id);
		System.out.println("Your mobile no:" +" "+ mobile_no);
		System.out.println("Name of the branch:"+ " "+ branch);
		System.out.println("Account type:"+ " "+ account_type);
		System.out.println("Account no:"+" "+account_no);
		System.out.println("1. Balance Check");
		System.out.println("2. Deposit");
		System.out.println("3. Withdrawl");
		System.out.println("4. Exit");
	
		
		int i;
		
		for (i=1;i<=6; i++) 
		{
	
		System.out.println("Choose a number");
		number= scanner.nextInt();
		

		
			switch(number)
			{
				case 1:
					System.out.println("Your balance is:"+ balance );
					break;
				case 2:
					System.out.println("Enter the amount to be deposited");
					int amt=scanner.nextInt();
					deposit(amt);
									
					break;
				case 3: 
					System.out.println("Enter the amount to be withdrawed");
					int amt1=scanner.nextInt();
					withdrawl(amt1);
					
					break;
				case 4: 
					System.out.println("Thank you for using our services");
					break;
				
				default:
					System.out.println("Invalid option");
					
			}
	
		}
	}


}