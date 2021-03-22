package com.mediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator{

	public List<IUser> userList;

	public ChatMediator() {
		userList = new ArrayList<>();
	}
	@Override
	public void addUser(IUser user) {
		// TODO Auto-generated method stub
		userList.add(user);
	}

	@Override
	public void sendMessage(String msg) {
		// TODO Auto-generated method stub
		
		for(IUser u : userList) {
			u.receiveMessage(msg);
		}
	}

	
	
}
