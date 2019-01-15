package com.qa;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void createAccount() {
		
		Account josh = new Account("Josh", "Dowling", 1);
		Account joel = new Account("Joel", "Halford", 2);
		
		
		assertEquals(josh.getLastName(), "Dowling");
		assertEquals(joel.getLastName(), "Halford");
		assertEquals(josh.getAccountNumber(), 1);

	}
}
