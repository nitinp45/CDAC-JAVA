package com.demo.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Account;
import com.demo.beans.CurrentAccount;
import com.demo.beans.DematAccount;
import com.demo.beans.SavingAccount;

public class AccountDaoImpl implements AccountDao {
	static Set<Account> accset;
	static {
		accset=new HashSet<>();
		accset.add(new SavingAccount("Nitin",1111,"maiden name?","Console",44444,2323));
		accset.add(new SavingAccount("Ketan",2222,"birth place?","Thane",34343,2211));
		accset.add(new CurrentAccount("Om",1111,"favorite color?","Orange",454545,20));
		accset.add(new CurrentAccount("Rohit",2222,"favorite cricketer","Virat",474745,20));
		accset.add(new DematAccount("Omkar",1234,"favorite movie","3 idiots",10000,3443));
		Account.setCnt(5);
	}
	

	@Override
	public boolean saveaccount(Account ac) {
		accset.add(ac);
		return true;
	}


	@Override
	public Set<Account> findAll() {
		return accset;
	}


	@Override
	public Account findById(String acid, int pin) {
		for(Account ac:accset) {
			if(ac.getAcid().equals(acid) && ac.getPin()==pin) {
				return ac;
			}
		}
		return null;
	}


	@Override
	public Account getById(String acid) {
		for(Account ac:accset) {
			if(ac.getAcid().equals(acid) ) {
				return ac;
			}
		}
		return null;
	}


	@Override
	public boolean removeAccount(String acid, int pin) {
		Account ac=findById(acid, pin);
		return accset.remove(ac);
		
		//return accset.removeIf(ac->ac.getAcid().equals(acid) && ac.getPin()==pin);   //why not we use becz it check the whole string and if we found and delete but after deleting again it checkeing whole list
	}


	@Override
	public Set<Account> sortById() {
		TreeSet<Account> ts=new TreeSet<>();
		for(Account ac:accset) {
			ts.add(ac);
		}
		return ts;
	}


	@Override
	public List<Account> sortByName() {
		Comparator<Account> c=(a1,a2)->{
			System.out.println("in compare method os comparator");
			return a1.getAname().compareTo(a2.getAname());};
		//TreeSet<Account> ts=new TreeSet<>(c);
		List<Account> lst=new ArrayList<>(accset.size());
		for(Account ac:accset) {
			lst.add(ac);
		}
		lst.sort(c);
		return lst;
	}

	
	@Override
	public List<Account> sortNames() {
		
		Comparator<Account> obj=(a1,a2)->{
			return a1.getAname().compareTo(a2.getAname());
		};
		List<Account> list=new ArrayList<>();
		for(Account a:accset)
		{
			list.add(a);
		}
		list.sort(obj);
		return list;
	}


	

}
