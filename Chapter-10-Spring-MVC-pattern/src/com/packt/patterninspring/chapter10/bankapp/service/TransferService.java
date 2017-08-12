/**
 * 
 */
package com.packt.patterninspring.chapter10.bankapp.service;

import java.util.List;

import com.packt.patterninspring.chapter10.bankapp.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public interface TransferService {
	
	void transfer(Long amount, Long a, Long b);
	
	Account open(Account account);
	
	List<Account> findAllAccounts();
}