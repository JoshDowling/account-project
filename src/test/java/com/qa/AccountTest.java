package com.qa;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void createAccountTest() {
		
		Account josh = new Account("Josh", "Dowling", 1);
		Account joel = new Account("Joel", "Halford", 2);
		
		
		assertEquals(josh.getFirstName(), "Josh");
		assertEquals(joel.getLastName(), "Halford");
		assertEquals(josh.getAccountNumber(), 1);

	}
	
	@Test
	public void searchNameTest() {
		Account josh = new Account("Josh", "Dowling", 1);
		Account joel = new Account("Joel", "Halford", 2);
		Account josh1 = new Account("Josh", "Downing", 3);
		Account joel1 = new Account("Joel", "Hall", 4);
		
		Service newService = new Service();
		
		assertEquals(newService.searchName("josh"), 2);
		
		
		
	}
	
	
	
	
	
}
