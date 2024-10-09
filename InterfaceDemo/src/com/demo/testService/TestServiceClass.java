package com.demo.testService;
import java.util.Arrays;
import java.util.Scanner;

import com.demo.beans.Account;
import com.demo.service.AccountService;

import com.demo.service.AccountServiceImpl;
public class TestServiceClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AccountService obj=new AccountServiceImpl();
		int choice=0;
		do {
			System.out.println("1. Add new Account");
			System.out.println("2. Delete by id");
			System.out.println("3. withdraw");
			System.out.println("4. deposit");
			System.out.println("5. check balance");
			System.out.println("6. display all");
			System.out.println("7. exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:obj.addNewData();
					break;
			case 2:System.out.println("enter acid");
					 int id=sc.nextInt();
					System.out.println("Enter pin");
					 int pin=sc.nextInt();
					 int acc=obj.deleteAccount(id,pin);
					if(acc>=0) {
						System.out.println("Account Deleted Successfully!");
					}else if(acc==-1) {
						System.out.println("not found");
					}else {
						System.out.println("pin is wrong");
					}
					break;
			case 3:
					System.out.println("enter acid");
					 id=sc.nextInt();
					System.out.println("Enter pin");
					 pin=sc.nextInt();
					System.out.println("enter amount to withdraw");
					double amt=sc.nextDouble();
					int status=obj.withdrawAmt(id,pin,amt);
					if(status>0) {
						System.out.println("Money Withdrawal done");
					}else if(status==-1) {
						System.out.println("not found");
					}else if(status==-3){
						System.out.println("insufitient balance");
					}else {
						System.out.println("pin is wrong");
					}
					break;
			case 4:System.out.println("Enter acid");
					 id=sc.nextInt();
					System.out.println("Enter pin");
					 pin=sc.nextInt();
					System.out.println("enter amount to deposit");
					 amt=sc.nextDouble();
					 status=obj.depositAmt(id,pin,amt);
					if(status>0) {
						System.out.println("Money Deposited Successfully");
					}else if(status==-1) {
						System.out.println("not found");
					}else {
						System.out.println("pin is wrong");
					}
					break;
			case 5:System.out.println("enter acid");
					 id=sc.nextInt();
					System.out.println("Enter pin");
					 pin=sc.nextInt();
					 double bal=obj.checkBalance(id,pin);
					if(bal>0) {
						System.out.println("Your Account Balance is rs: "+bal);
					}else if(bal==-1.0) {
						System.out.println("not found");
					}else if(bal==-3.0){
						System.out.println("insufitient balance");
					}else {
						System.out.println("pin is wrong");
					}
					break;
			case 6:Account[] ac=obj.displayAll();
//			Arrays.stream(ac).forEach(o->{if(ac!=null)System.out.println(o);});
				for(Account a1:ac)
					{
						if(a1!=null)
						{
							System.out.println(a1);
						}
					}
				  break;
			case 7:sc.close();
				  break;
			default:
				System.out.println("wrong choice");
				break;
			}
		}while(choice!=7);

	}

}
