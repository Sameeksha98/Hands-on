package com.mediatorPattern;

public interface IChatMediator {

	public void addUser(IUser user);
	public void sendMessage(String msg);
}
