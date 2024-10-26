package com.demo.beans;

public class DematAccount extends Account{
	
	private int tpin;
	private static float int_rate;
	private static float min_amount;
	
	static {
		int_rate=0.08f;
		min_amount=1000f;
	}

	public DematAccount() {
		super("d");
	}

	public DematAccount(String aname, int pin, String question, String ans, double balance, int tpin) {
		super("d",aname,pin,question,  ans,balance);
		this.tpin = tpin;
	}
	

	public static float getInt_rate() {
		return int_rate;
	}

	public static void setInt_rate(float int_rate) {
		DematAccount.int_rate = int_rate;
	}

	public static float getMin_amount() {
		return min_amount;
	}

	public static void setMin_amount(float min_amount) {
		DematAccount.min_amount = min_amount;
	}

	public int getTpin() {
		return tpin;
	}

	public void setTpin(int tpin) {
		this.tpin = tpin;
	}

	@Override
	public String toString() {
		return super.toString()+"DematAccount [tpin=" + tpin + "]";
	}

	@Override
	public int withdraw(double amt) {
		if(balance-amt>=min_amount) {
			balance-=amt+((18*amt)/100);
			return 1;
		}
		return 2;
	}
	
	
	

}
