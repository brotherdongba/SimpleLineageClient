package com.dongba.client;

import java.io.IOException;

import com.dongba.model.Account;
import com.dongba.model.Character;

public class SessionManager {
	
	public SessionManager(MessageTransporter mt, Character c) throws IOException {
		Account account = new Account(mt.getAccountId());
		account.setCharacter(c);
		mt.send(account);
	}

}
