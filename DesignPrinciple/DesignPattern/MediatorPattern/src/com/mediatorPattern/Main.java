package com.mediatorPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatMediator chatMediator=new ChatMediator();
		IUser user =new BasicUser(chatMediator,"Joe");
		chatMediator.addUser(new BasicUser(chatMediator,"John"));
		chatMediator.addUser(new BasicUser(chatMediator,"Paul"));
		chatMediator.addUser(new PremiumUser(chatMediator,"Jane"));
		chatMediator.addUser(new PremiumUser(chatMediator,"Joy"));
		
		user.sendMessage("Hello");
	}

}
