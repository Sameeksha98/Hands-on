package com.cts.finalCheck;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService{

	private List<INotificationObserver> observerList = new ArrayList<>();
	@Override
	public void addSubscriber(INotificationObserver observer) {
		// TODO Auto-generated method stub
		observerList.add(observer);
		
	}

	@Override
	public void removeSubscriber(INotificationObserver observer) {
		// TODO Auto-generated method stub
		observerList.remove(observer);
		
	}

	@Override
	public void notifySubscriber() {
		// TODO Auto-generated method stub
		for(INotificationObserver o : observerList) {
			o.OnBook();
		}
	}

}
