package com.dongba.client;

import java.io.IOException;

import com.dongba.model.Account;

public class SessionManager {
	
	public SessionManager(MessageTransporter mt, String cName) throws IOException {
		Account account = new Account(mt.getAccountId());
		account.setCurrCharacterName(cName);
		mt.send(account);
	}

}
