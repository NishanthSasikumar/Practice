package com.backendPractice;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
	@Autowired
	StoreUser storeUser;
	
	public void sentUser(String Name,String passWord)
	{
		storeUser.save(Name,passWord);
	}
}
