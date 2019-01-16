package com.qa;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	Account josh;
	Account josh1;
	Account joel;
	Account joel1;
	Service newService;
	
	@Before
	public void setup() {
	
	josh = new Account("Josh", "Dowling", 1);
	joel = new Account("Joel", "Halford", 2);
	josh1 = new Account("Josh", "Downing", 3);
	joel1 = new Account("Joel", "Hall", 4);
	
	newService = new Service();
	
	newService.addAccount(josh);
	newService.addAccount(joel);
	newService.addAccount(josh1);
	newService.addAccount(joel1);
	
	}
	
	@Test
	public void createAccountTest() {
		
		
		assertEquals(josh.getFirstName(), "Josh");
		assertEquals(joel.getLastName(), "Halford");
		assertEquals(josh.getAccountNumber(), 1);

	}
	
	@Test
	public void searchNameTest() {
			
		
		assertEquals( 2, newService.searchName("Josh"));
		
		
	}
	@Test
	public void getAccountsTest() {
		
		
		assertEquals(newService.getAccounts().size(), 4 );
	}
	
	
	
	
	
}
