package pro;


import java.util.Scanner;

public class Banking_App {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
	BankAccount b1= new BankAccount("Dude", "007");
	b1.showmenu();
	
}

}
class BankAccount{
	 static {
		 System.out.println("=======Welcome to Anuradha cheat Fund ========");
	 }
	
	int balance;
	int previousTransaction;
	String CustomerName;
	String Custid;
	
	public BankAccount(String cname,String cid){
		CustomerName=cname;
		Custid=cid;
		
		
	}
	
	void deposit(int amount) {
		if(amount!=0) {
			balance=balance+amount;
			previousTransaction=amount;
		}
	}
	void withdraw(int amount) {
		if(amount!=0) {
			balance=balance-amount;
			previousTransaction= -amount;
		}
		
	}
	void getpreviousTransaction() {
		if(previousTransaction>0) {
			System.out.println("Deposited"+previousTransaction);
		}
		else if(previousTransaction<0) {
			System.out.println("withdrawn: "+Math.abs(previousTransaction));//abs method convert negative balance into +ve
		}
		else {
			System.out.println("no trasaction is occured");
		}
		
	}
	public void showmenu() {
		char option='\0';
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Welcome "+CustomerName);
	   System.out.println("your id is :"+Custid);
	   System.out.println("A.Check Balance");
	   System.out.println("B.Deposit");
	   System.out.println("c.Withdraw");
	   System.out.println("D.previous Transaction");
	   System.out.println("E.Exit");
	   
	   do {
		   System.out.println("=============================");
		   System.out.println("Enter the options ");
		   System.out.println("=============================");
		   option = sc.next().charAt(0);
		    char t=Character.toUpperCase(option);
		   
		   switch (t)
		   {
			   case 'A':
				   System.out.println("=======================");
				   System.out.println("BAlance is: "+balance);
				   System.out.println("=======================");
				   System.out.println();
				   break;
				   
			   case 'B':
				   System.out.println("=======================");
				   System.out.println("Enter the amount to deposit");
				   System.out.println("=======================");
				   int amount= sc.nextInt();
				   deposit(amount);
				   System.out.println();
				   break;
				   
			   case 'c':
				   System.out.println("=======================");
				   System.out.println("Enter the amount to withdraw");
				   System.out.println("=======================");
				   int amount2=sc.nextInt();
				   withdraw(amount2);
				   System.out.println();
				   break;
				   
			   case 'D':
				   System.out.println("=======================");
				   getpreviousTransaction();
				   System.out.println("=======================");
				   System.out.println();
				   break;
				   
			   case 'E':
				   System.out.println("=======================");
				   break;
				   
				default:
				   System.out.println("Invalid Options please try again");
		   }
				   
				   
				   
				   
		   }while(option != 'E');
		   
	   }
	   
	   
	}

