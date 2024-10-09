package com.demo.service;
import java.util.Scanner;
import com.demo.beans.Account;

public class AccountServiceImpl implements AccountService {
	
	static Account[] acarr;
	static int cnt;
	
	static {
		acarr=new Account[40];
		acarr[0]=new Account(1,"ketan",500000.0,3232);
		acarr[1]=new Account(2,"om",700000.0,3032);
		cnt=2;
	}
		
	@Override
	public void addNewData() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int acid=sc.nextInt();
		System.out.println("Enter accountholder name");
		String nm=sc.next();
		System.out.println("Enter account balance");
		double bal=sc.nextDouble();
		System.out.println("Enter account pin");
		int pin=sc.nextInt();
		acarr[cnt++]=new Account(acid,nm,bal,pin);
	}

	@Override
	public Account[] displayAll() {
		return acarr;
		
	}
	
	private static int findById(int id,int pin) {
		for(int i=0;i<acarr.length;i++)
		{
				if(acarr[i].getAccid()==id)
				{
					if(acarr[i].getPin()==pin)
					{
						return i;
					}
					else {
						return -2;
					}
				}
		}
		return -1;
	}
	

	@Override
	public int withdrawAmt(int id, int pin, double amt) {
		int pos=findById(id,pin);
		if(pos>=0)
		{
			boolean status=acarr[pos].withdrawAmt(amt);
			if(status)
			{
				return 1;
			}
			else {
				return -3;
			}
		}
		
		return pos;
	}

	@Override
	public int depositAmt(int id, int pin, double amt) {
		int pos = findById(id, pin);
		
		if(pos>=0)
		{
			boolean status=acarr[pos].depositAmt(amt);
			if(status)
			{
				return 1;
			}
			else {
				return -3;
			}
		}
		
		return pos;
	}

	@Override
	public double checkBalance(int id, int pin) {
		// TODO Auto-generated method stub
				int pos = findById(id, pin);
		
		if(pos>=0)
		{
			double status=acarr[pos].checkBal();
			if(status>0)
			{
				return status;
			}
			else {
				return -3.0;
			}
		}
		
		return 1.0;
	}

	@Override
	public int deleteAccount(int id, int pin) {
		// TODO Auto-generated method stub
		int pos = findById(id, pin);
		if(pos>=0)
		{
			for(int i =pos;i<cnt;i++)
			{
				acarr[i]=acarr[i+1];
			}
			cnt--;
			return pos;
		}
		return -1;
	}

	
	

}
