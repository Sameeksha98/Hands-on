package com.cts.practiceCheck;

public interface INotificationObserver {

	String name = "";
	
	public void OnServerDown();
	
	public String getName();
}
