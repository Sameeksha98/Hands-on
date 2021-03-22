package com.mediatorPattern;

public class BasicUser implements IUser{

	private ChatMediator chatMediator;
	private String name;
	
	
	public BasicUser(ChatMediator chatMediator, String name) {
		super();
		this.chatMediator = chatMediator;
		this.name = name;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void receiveMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("User name:"+name+ " message: "+msg);
	}


	@Override
	public void sendMessage(String msg) {
		// TODO Auto-generated method stub
		chatMediator.sendMessage(msg);
	}


	

}
