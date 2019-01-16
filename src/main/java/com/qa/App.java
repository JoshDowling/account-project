package com.qa;

import com.google.gson.Gson;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		Account josh = new Account("Josh", "Dowling", 1);
		Account joel = new Account("Joel", "Halford", 2);
		
		Service newService = new Service();
		newService.addAccount(josh);
		newService.addAccount(joel);
		
		newService.getAccounts();
		
		Gson gson = new Gson();
		String json = gson.toJson(newService.accountList);
		System.out.println(json);
		
		System.out.println(newService.searchName("Josh"));
	}
}
