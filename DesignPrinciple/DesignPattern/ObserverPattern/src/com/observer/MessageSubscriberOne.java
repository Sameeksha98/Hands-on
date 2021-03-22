package com.observer;

public class MessageSubscriberOne implements Observer{

	@Override
	public void update(Message m) {
		// TODO Auto-generated method stub
		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
	}

}
