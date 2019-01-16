package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Account;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class AccountDBRepository implements AccountRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	public String getAllAccounts() {
		Query query = manager.createQuery("Select a FROM Account a");
		Collection<Account> accounts = (Collection<Account>) query.getResultList();
		return util.getJSONForObject(accounts);
	}

	public String createAccount(String accout) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateAccount(Long id, String accountToUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteAccount(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

//	String getAllAccounts();
//
//	String createAccount(String accout);
//
//	String updateAccount(Long id, String accountToUpdate);
//
//	String deleteAccount(Long id);


}
