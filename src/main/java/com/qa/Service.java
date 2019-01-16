package com.qa;

import java.util.HashMap;


public class Service {


	HashMap<Integer, Account> accountList = new HashMap<Integer, Account>();
	
	
	public void addAccount(Account account) {
		accountList.put(account.getAccountNumber(), account);
	}
	
	
	
	public HashMap<Integer, Account> getAccounts() {
		
		return accountList;
		
		}
		
	public int searchName(String string) {
		int counter = 0;
		for(int i = 1; i<accountList.size()+1; i++){
			
			if (accountList.get(i).getFirstName().equals(string)) {
				counter++;
			}
		}
				
		return counter;
	}
	

	}

	
